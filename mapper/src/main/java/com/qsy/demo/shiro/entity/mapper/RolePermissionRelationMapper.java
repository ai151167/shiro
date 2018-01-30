package com.qsy.demo.shiro.entity.mapper;

import com.qsy.demo.shiro.entity.RolePermissionRelation;
import com.qsy.demo.shiro.entity.RolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    long countByExample(RolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int deleteByExample(RolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int deleteByPrimaryKey(Integer rolePermissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int insert(RolePermissionRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int insertSelective(RolePermissionRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    List<RolePermissionRelation> selectByExample(RolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    RolePermissionRelation selectByPrimaryKey(Integer rolePermissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int updateByExampleSelective(@Param("record") RolePermissionRelation record, @Param("example") RolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int updateByExample(@Param("record") RolePermissionRelation record, @Param("example") RolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int updateByPrimaryKeySelective(RolePermissionRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    int updateByPrimaryKey(RolePermissionRelation record);
}