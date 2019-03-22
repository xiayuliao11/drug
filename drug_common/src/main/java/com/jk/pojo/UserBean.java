package com.jk.pojo;

import lombok.Data;

import java.io.Serializable;


@Data
public class UserBean implements Serializable {

    private static final long serialVersionUID = 2025021531786005462L;
    private Integer id;  //用户ID
    private String  account;//账号
    private String  userName; //用户名
    private String  userPwd;  //用户密码
    private String  userNewPwd; //新密码
    private String  userPhone;//手机号
    private Integer  state;    //黑名单
    private String rememberPwd;  //记住密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserNewPwd() {
        return userNewPwd;
    }

    public void setUserNewPwd(String userNewPwd) {
        this.userNewPwd = userNewPwd;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRememberPwd() {
        return rememberPwd;
    }

    public void setRememberPwd(String rememberPwd) {
        this.rememberPwd = rememberPwd;
    }
}
