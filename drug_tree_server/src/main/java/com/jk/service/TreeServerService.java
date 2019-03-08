package com.jk.service;


import com.jk.pojo.TreeBean;

import java.util.List;

public interface TreeServerService {
    /**
     * 查询左侧树
     * @return
     */
    List<TreeBean> getTree();
}
