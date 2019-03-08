package com.jk.service.impl;

import com.jk.mapper.TreeMapper;
import com.jk.pojo.TreeBean;
import com.jk.service.TreeServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeServiceImpl implements TreeServerService {
    @Autowired
    TreeMapper treeMapper;

    /**
     * 获取左侧树
     * @return
     */
    @Override
    public List<TreeBean> getTree() {
        List<TreeBean> list = treeMapper.getTree(0);
        getTreeChildren(list);
        return list;
    }

    private void getTreeChildren(List<TreeBean> list) {
        for (TreeBean tree : list) { // 遍历树的集合
            List<TreeBean> childrenList = treeMapper.getTree(tree.getId());// 找到树条目中孩子的集合
            getTreeChildren(childrenList);// 递归调用
            if(childrenList.size()>0) {
                tree.setNodes(childrenList);// 把孩子的集合给当前树
            }

        }
    }
}
