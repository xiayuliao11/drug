package com.jk.treeservice;

import com.jk.pojo.TreeBean;

import java.util.List;

public interface TreeServiceService {
    /**
     * 获得左侧树
     * @return
     */
    List<TreeBean> getTree();
}
