package com.qsy.demo.shiro.entity;

import java.util.Date;

public class UserRoleRelation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_relation.USER_ROLE_ID
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private Integer userRoleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_relation.USER_ID
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_relation.ROLE_ID
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_relation.USER_ROLE_STATE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String userRoleState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_relation.USER_ROLE_UPDATETIME
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private Date userRoleUpdatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_relation.USER_ROLE_ID
     *
     * @return the value of user_role_relation.USER_ROLE_ID
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public Integer getUserRoleId() {
        return userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_relation.USER_ROLE_ID
     *
     * @param userRoleId the value for user_role_relation.USER_ROLE_ID
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_relation.USER_ID
     *
     * @return the value of user_role_relation.USER_ID
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_relation.USER_ID
     *
     * @param userId the value for user_role_relation.USER_ID
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_relation.ROLE_ID
     *
     * @return the value of user_role_relation.ROLE_ID
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_relation.ROLE_ID
     *
     * @param roleId the value for user_role_relation.ROLE_ID
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_relation.USER_ROLE_STATE
     *
     * @return the value of user_role_relation.USER_ROLE_STATE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getUserRoleState() {
        return userRoleState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_relation.USER_ROLE_STATE
     *
     * @param userRoleState the value for user_role_relation.USER_ROLE_STATE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserRoleState(String userRoleState) {
        this.userRoleState = userRoleState == null ? null : userRoleState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_relation.USER_ROLE_UPDATETIME
     *
     * @return the value of user_role_relation.USER_ROLE_UPDATETIME
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public Date getUserRoleUpdatetime() {
        return userRoleUpdatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_relation.USER_ROLE_UPDATETIME
     *
     * @param userRoleUpdatetime the value for user_role_relation.USER_ROLE_UPDATETIME
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserRoleUpdatetime(Date userRoleUpdatetime) {
        this.userRoleUpdatetime = userRoleUpdatetime;
    }
}