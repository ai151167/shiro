package com.qsy.demo.shiro.entity;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_ID
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_ACCOUNT
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String userAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_PASSWORD
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String userPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_NAME
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_PHONE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String userPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_PROVINCE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String userProvince;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_CITY
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String userCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_TOWN
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String userTown;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_EMAIL
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String userEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_ISADMIN
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String userIsadmin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_STATE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String userState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_CREATETIME
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private Date userCreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_LASTlOGINTIME
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private Date userLastlogintime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_ADDRESS
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String userAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_BIRTHDAY
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private Date userBirthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_SALT
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    private String userSalt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_ID
     *
     * @return the value of user.USER_ID
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_ID
     *
     * @param userId the value for user.USER_ID
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_ACCOUNT
     *
     * @return the value of user.USER_ACCOUNT
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_ACCOUNT
     *
     * @param userAccount the value for user.USER_ACCOUNT
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_PASSWORD
     *
     * @return the value of user.USER_PASSWORD
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_PASSWORD
     *
     * @param userPassword the value for user.USER_PASSWORD
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_NAME
     *
     * @return the value of user.USER_NAME
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_NAME
     *
     * @param userName the value for user.USER_NAME
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_PHONE
     *
     * @return the value of user.USER_PHONE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_PHONE
     *
     * @param userPhone the value for user.USER_PHONE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_PROVINCE
     *
     * @return the value of user.USER_PROVINCE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getUserProvince() {
        return userProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_PROVINCE
     *
     * @param userProvince the value for user.USER_PROVINCE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince == null ? null : userProvince.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_CITY
     *
     * @return the value of user.USER_CITY
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getUserCity() {
        return userCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_CITY
     *
     * @param userCity the value for user.USER_CITY
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_TOWN
     *
     * @return the value of user.USER_TOWN
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getUserTown() {
        return userTown;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_TOWN
     *
     * @param userTown the value for user.USER_TOWN
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserTown(String userTown) {
        this.userTown = userTown == null ? null : userTown.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_EMAIL
     *
     * @return the value of user.USER_EMAIL
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_EMAIL
     *
     * @param userEmail the value for user.USER_EMAIL
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_ISADMIN
     *
     * @return the value of user.USER_ISADMIN
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getUserIsadmin() {
        return userIsadmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_ISADMIN
     *
     * @param userIsadmin the value for user.USER_ISADMIN
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserIsadmin(String userIsadmin) {
        this.userIsadmin = userIsadmin == null ? null : userIsadmin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_STATE
     *
     * @return the value of user.USER_STATE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getUserState() {
        return userState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_STATE
     *
     * @param userState the value for user.USER_STATE
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserState(String userState) {
        this.userState = userState == null ? null : userState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_CREATETIME
     *
     * @return the value of user.USER_CREATETIME
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public Date getUserCreatetime() {
        return userCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_CREATETIME
     *
     * @param userCreatetime the value for user.USER_CREATETIME
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserCreatetime(Date userCreatetime) {
        this.userCreatetime = userCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_LASTlOGINTIME
     *
     * @return the value of user.USER_LASTlOGINTIME
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public Date getUserLastlogintime() {
        return userLastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_LASTlOGINTIME
     *
     * @param userLastlogintime the value for user.USER_LASTlOGINTIME
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserLastlogintime(Date userLastlogintime) {
        this.userLastlogintime = userLastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_ADDRESS
     *
     * @return the value of user.USER_ADDRESS
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_ADDRESS
     *
     * @param userAddress the value for user.USER_ADDRESS
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_BIRTHDAY
     *
     * @return the value of user.USER_BIRTHDAY
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public Date getUserBirthday() {
        return userBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_BIRTHDAY
     *
     * @param userBirthday the value for user.USER_BIRTHDAY
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_SALT
     *
     * @return the value of user.USER_SALT
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getUserSalt() {
        return userSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_SALT
     *
     * @param userSalt the value for user.USER_SALT
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt == null ? null : userSalt.trim();
    }
}