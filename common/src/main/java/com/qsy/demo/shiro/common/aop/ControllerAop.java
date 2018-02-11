package com.qsy.demo.shiro.common.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qsy.demo.shiro.common.exception.CheckException;
import com.qsy.demo.shiro.common.resultbean.ResultBean;



public class ControllerAop {
	private static final Logger LOGGER = LoggerFactory.getLogger(ControllerAop.class); 
	
	public Object handlerControllerMethod(ProceedingJoinPoint point) {
		ResultBean<?> resultBean ;
		try {
			resultBean = (ResultBean<?>) point.proceed();
		} catch (Throwable e) {
			resultBean = handlerException(point,e);
		}
		return resultBean;
	}

	private ResultBean<?> handlerException(ProceedingJoinPoint point, Throwable e) {
		ResultBean<?> resultBean = new ResultBean<>();
		if(e instanceof CheckException) {
			resultBean.setMsg(e.getLocalizedMessage());
			resultBean.setCode(ResultBean.FAIL);
		}else {
			LOGGER.error(point.getSignature()+"error",e);
			resultBean.setMsg(e.toString());
			resultBean.setCode(ResultBean.FAIL);

		}
		return resultBean;
	}
}
