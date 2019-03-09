package com.jk.mapper;

import com.jk.pojo.UserBean;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PortMapper {
    //查询用户信息
    @Select("select * from drug_user where id=#{id}")
    UserBean findUserById(Integer id);
    //修改密码
    @Update("update drug_user set userPwd=#{userNewPwd} where id=#{id} ")
    Boolean updateUserPwd(UserBean userBean);
}
