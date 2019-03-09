package com.jk.service;

import com.jk.mapper.PortMapper;
import com.jk.pojo.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PortServiceImpl implements PortsService {

    @Autowired
    private PortMapper portMapper;

    /**
     * 用户查询
     * @param id
     * @return
     */
    @Override
    public UserBean findUserById(Integer id) {
        return portMapper.findUserById(id);
    }

    /**
     * 修改密码
     * @param userBean
     * @return
     */
    @Override
    public Boolean updateUserPwd(UserBean userBean) {
        return portMapper.updateUserPwd(userBean);
    }
}
