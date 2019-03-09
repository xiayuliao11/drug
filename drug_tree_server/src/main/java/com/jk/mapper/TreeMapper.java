package com.jk.mapper;

import com.jk.pojo.TreeBean;

import java.util.List;

public interface TreeMapper {
    /**
     * 获得左侧树
     * @param id
     * @return
     */
    List<TreeBean> getTree(Integer id);
}
