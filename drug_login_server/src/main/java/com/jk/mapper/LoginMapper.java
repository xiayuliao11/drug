package com.jk.mapper;

import com.jk.pojo.UserBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface LoginMapper {
    /**
     * 查询用户是否存在
     * @param user
     * @return
     */
    UserBean getQuery(@Param("account") String account,@Param("userPwd") String userPwd);

    @Select("select * from t_userbean where account=#{account} and userPwd=#{userPwd}")
    UserBean getUser(UserBean user);

    @Select("select * from t_userbean where userPhone=#{phone_no}")
    UserBean getUserBeanByPhone(@Param("phone_no") String phone_no);
}
