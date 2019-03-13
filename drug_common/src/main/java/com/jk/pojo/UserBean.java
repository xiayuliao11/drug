package com.jk.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;

public class UserBean {

public class UserBean implements Serializable {

    private static final long serialVersionUID = 2025021531786005462L;
    private Integer id;  //用户ID
    private String  userName; //用户名
    private String  userPwd;  //用户密码
    private String  userNewPwd; //新密码

    public String getUserNewPwd() {
        return userNewPwd;
    }

    public void setUserNewPwd(String userNewPwd) {
        this.userNewPwd = userNewPwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userNewPwd='" + userNewPwd + '\'' +
                '}';
    }
}
