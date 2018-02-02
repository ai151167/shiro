<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<meta name="description" content="">
<meta name="author" content="">

<title>goodsInfo</title>
<base href="${pageContext.request.contextPath}/">
<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.css" rel="stylesheet">

<link href="/js/zTree/css/zTreeStyle/zTreeStyle.css" rel="stylesheet">
<link href="/js/jquery-easyui/themes/default/easyui.css" rel="stylesheet">

</head>
<body>
	<div class="jumbotron" >
		<div class="row">
			<div class="row">
				<div class="col-md-2 col-md-offset-1">
						<h3>列表信息</h3>
				</div>
			</div>
			<div class="row">
				<div class="col-md-1"></div>
			 	<div class="col-md-8">
			 		<div class="row">
			 			<div class="col-md-1">
					 		<label for="searchInfo">SEARCH</label>
					 	</div>
					 	<div class="col-md-3">
					 		<input class="form-control" id="searchInfo" placeholder="searchInfo" name="" type="text"/>
					 	</div>
					 	<div class="col-md-6">
					 		<div class="row">
							  <div class="col-md-12">
							    <div class="input-group">
							      <div class="input-group-btn">
							        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">选择 <span class="caret"></span></button>
							        <ul class="dropdown-menu">
							          <li><a class="price">0--100</a></li>
							          <li><a class="price">100--200</a></li>
							          <li><a class="price">200--300</a></li>
							        </ul>
							      </div>
							      <div class="row">
							   		   <div class="col-md-5">
							   		   		<input type="text" class="form-control"  id ="lowPrice" name ="lowPrice" placeholder="lowPrice">
							   		   </div>
								      <div class="col-md-1">
							   		   		<span style="font-size: x-large;">━</span>
							   		   </div>
							   		   <div class="col-md-5">
							   		   		<input type="text" class="form-control" id="tallPrice" name="tallPrice" placeholder="tallPrice">
							   		   </div>
							      </div>
							    </div>
							  </div>
							 </div>
					 	</div>
					 	<button type="button" class="btn btn btn-primary btn-sm" id="searchs">搜索</button>
				 	</div>
			 	</div>
  				<div class="col-md-2">
  					<button type="button" class="btn btn btn-info btn-sm goodsInfo" genre = "addInfo">添加</button>
					<button type="button" class="btn btn btn-warning btn-sm" id="deleteGoodsInfoAll">删除</button>
  				</div>
			</div>
			<div class="row">
			<div class="col-md-1"></div>
				<div class="col-md-10">
					<table class="table table-hover">
						<thead>
							<th><input id="deleteAll" type="checkbox"/></th>
							<th>名称</th>
							<th>描述</th>
							<th>图片</th>
							<th>数量</th>
							<th>价格</th>
							<th>分类</th>
							<th>状态</th>
							<th>操作</th>
						</thead>
						<tbody>
						<c:if test="${not empty goodsInfos}">
							<c:forEach items="${goodsInfos}" var="goods">
								<tr>
									<td><input class="deleteOne" type="checkbox" value="${goods.goodsId}"/></td>
									<td>${goods.goodsName}</td>
									<td>${goods.goodsDesc}</td>
									<td>${goods.goodsImage}</td>
									<td>${goods.goodsCount}</td>
									<td>${goods.goodsPrice}</td>
									<td>${goods.sortName}</td>
									<td>${goods.goodsState}</td>
									<td>
										<button type="button" class="btn btn btn-info btn-primary btn-xs goodsInfo" genre="updateGoodsInfo" value="${goods.goodsId}">修改</button>
										<button type="button" class="btn btn btn-warning btn-primary btn-xs goodsInfoDelete" value="${goods.goodsId}">删除</button>
									</td>
								</tr>
							</c:forEach>
						</c:if>
						</tbody>
						<tfoot>
							<tr>
								<td colspan="8" style="text-align:center;" id ="page"></td>
								
							</tr>
						</tfoot>
					</table>
					<input type="hidden" id="count" value="${count}">
					<input type="hidden" id="pages" value="${pages}">
				</div>
			</div>
		</div>

	</div>
	<!-- 模态 -->
		<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="gridSystemModalLabel" id="info">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="gridSystemModalLabel"></h4>
		      </div>
		      <div class="modal-body">
			       <form id="goodsInfoForm">
				       <input type="hidden" id="goodsId" name="goodsId">
						<div class="row">
							  <div class="col-xs-5 col-md-offset-1">
							  <label for="sortName">SORT_INFO</label>
							 	 <div class="row">
							 	 	<div class="col-xs-5">
								 	 	<div class="input-group-btn">
									       	 <button type="button" class="btn btn-default dropdown-toggle "  id="sortInfoChange">选择 <span class="caret"></span></button>
									      	  <ul class="dropdown-menu" id="sortInfo">
									      	  	 <li><a class="sortInfo">暂无分类</a>
									      	  	 	<ul>
												
												        <li><a href="#">二级栏目</a></li>
												
												        <li><a href="#">二级栏目</a></li>
												
												        <li><a href="#">二级栏目</a></li>
												
												        <li><a href="#">二级栏目</a></li>
												
												      </ul>
									      	  	 </li>
									         	 <li><a class="sortInfo"  genre="${li_sortId}">${li_sortName}</a></li>
									      	  </ul>
								      	</div>
								    </div>	
								    <div class="col-xs-7">
							 	 		<input type="text" class="form-control" id="sortName" name="sortName" value="${sortName }" readonly="readonly">
							 	 		<input type="hidden" id="sortId" name="sortId" value="${sortId}"/>
							 	    </div>
							 	 	
						         </div>
							  </div>
							  <div class="col-xs-5">
							  <label for="goodsName">GOODS_NAME</label>
							    <input type="text" class="form-control" id="goodsName" placeholder="GOODS_NAME" name = "goodsName">
							  </div>
						</div>
						<div class="row">
							  <div class="col-xs-5 col-md-offset-1">
							  <label for="goodsPrice">GOODS_PRICE</label>
							    <input type="text" class="form-control" id="goodsPrice" placeholder="GOODS_PRICE" name = "goodsPrice">
							  </div>
							  <div class="col-xs-5">
							  <label for="goodsCount">GOODS_COUNT</label>
							    <input type="text" class="form-control" id="goodsCount" placeholder="GOODS_COUNT" name = "goodsCount">
							  </div>
						</div>
						<div class="row">
							  <div class="col-xs-10 col-md-offset-1">
							 	 <label for="goodsDesc">GOODS_DESC</label>
							 	 <textarea class="form-control" rows="2" id="goodsDesc" name="goodsDesc"></textarea>
							  </div>
						</div>
						<div class="row">
							  <div class="col-xs-10 col-md-offset-1">
							 	 <label for="goodsImage">GOODS_IMAGE</label>
							 	 <img src="..." class="img-responsive" alt="Responsive image" id="goodsImage" name="goodsImage">
							  </div>
						</div>
						  <div class="form-group row">
							  <div class="col-xs-5 col-md-offset-1">
							    <label for="exampleInputFile">图片</label>
							    <input type="file" id="exampleInputFile">
							   </div>
						  </div>
					</form>
		      </div>
		      <div class="modal-footer">
		        <button type="button" id="close" class="btn btn-default" data-dismiss="modal">Close</button>
		        <button type="button" id="save" data-loading-text="Loading..." class="btn btn-primary" autocomplete="off">Save</button>
		      </div>
		    </div><!-- /.modal-content -->
		  </div><!-- /.modal-dialog -->
		</div><!-- /.modal -->


	<script src="/js/jquery-3.2.1.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/paging/paging.js"></script>
	<script src="/js/views/goods/goodsInfo.js"></script>
	<script src="/js/zTree/js/jquery.ztree.core.js"></script>
	<script src="/js/layer/layer.min.js"></script>
	<script src="/js/jquery-easyui/jquery.easyui.min.js"></script>
</body>
</html>