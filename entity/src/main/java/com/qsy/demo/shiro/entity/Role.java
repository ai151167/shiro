package com.qsy.demo.shiro.entity;

import java.util.Date;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.ROLE_ID
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.ROLE_NAME
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String roleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.ROLE_DESC
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String roleDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.ROLE_STATE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String roleState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.ROLE_CREATEDATE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private Date roleCreatedate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.ROLE_ID
     *
     * @return the value of role.ROLE_ID
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.ROLE_ID
     *
     * @param roleId the value for role.ROLE_ID
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.ROLE_NAME
     *
     * @return the value of role.ROLE_NAME
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.ROLE_NAME
     *
     * @param roleName the value for role.ROLE_NAME
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.ROLE_DESC
     *
     * @return the value of role.ROLE_DESC
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.ROLE_DESC
     *
     * @param roleDesc the value for role.ROLE_DESC
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.ROLE_STATE
     *
     * @return the value of role.ROLE_STATE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getRoleState() {
        return roleState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.ROLE_STATE
     *
     * @param roleState the value for role.ROLE_STATE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setRoleState(String roleState) {
        this.roleState = roleState == null ? null : roleState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.ROLE_CREATEDATE
     *
     * @return the value of role.ROLE_CREATEDATE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public Date getRoleCreatedate() {
        return roleCreatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.ROLE_CREATEDATE
     *
     * @param roleCreatedate the value for role.ROLE_CREATEDATE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setRoleCreatedate(Date roleCreatedate) {
        this.roleCreatedate = roleCreatedate;
    }
}