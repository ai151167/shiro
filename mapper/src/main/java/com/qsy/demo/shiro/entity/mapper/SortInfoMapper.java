package com.qsy.demo.shiro.entity.mapper;

import com.qsy.demo.shiro.entity.SortInfo;
import com.qsy.demo.shiro.entity.SortInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SortInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    long countByExample(SortInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int deleteByExample(SortInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int insert(SortInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int insertSelective(SortInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    List<SortInfo> selectByExample(SortInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int updateByExampleSelective(@Param("record") SortInfo record, @Param("example") SortInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int updateByExample(@Param("record") SortInfo record, @Param("example") SortInfoExample example);
}