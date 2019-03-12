package com.jk.service.impl;

import com.jk.mapper.TreeMapper;
import com.jk.pojo.TreeBean;
import com.jk.service.TreeServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.reflect.generics.tree.Tree;

import java.util.List;

@Service
public class TreeServiceImpl implements TreeServiceService {
    @Autowired
    TreeMapper mapper;

    /**
     * 获得左侧树
     * @return
     */
    /*@ResponseBody
    @Override
    public List<TreeBean> getTree() {
        List<TreeBean> list = mapper.getTree(0);
        getTreeChildren(list);
        return list;
    }

    private void getTreeChildren(List<TreeBean> list) {
        for (TreeBean tree : list) { // 遍历树的集合
            List<TreeBean> childrenList = mapper.getTree(tree.getId());// 找到树条目中孩子的集合
            getTreeChildren(childrenList);// 递归调用
            if(childrenList.size()>0) {
                tree.setNodes(childrenList);// 把孩子的集合给当前树
            }

        }
    }*/
    @Override
    @ResponseBody
    public List<TreeBean> getTree() {
        int pid=0;
        List<TreeBean> list = findNodes(pid);
        return list;
    }
    private List<TreeBean> findNodes(int pid) {
        List<TreeBean> list = mapper.getTree(pid);
        for (TreeBean tree : list) {
            Integer id = tree.getId();
            List<TreeBean> nodes = findNodes(id);
            if(nodes.size()<=0){
                //无子节点
                tree.setSelectable(true);
            }else{
                //有子节点
                tree.setSelectable(false);
                tree.setNodes(nodes);
            }
        }
        return list;
    }
}
