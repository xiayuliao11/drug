package com.jk.controller;

import com.jk.pojo.TreeBean;
import com.jk.treeservice.TreeServiceDamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("to")
public class TreeController {
    @Autowired
    TreeServiceDamo treeServiceDamo;
    /***
     * 跳转页面
     * @param
     * @return
     */
    @RequestMapping("toview")
    public String tovivw(String name){

        return name;
    }

    /***
     * 获取左侧树
     * @return
     */
    @ResponseBody
    @RequestMapping("getTree")
    public List<TreeBean> getTree(){
        List<TreeBean> tree = treeServiceDamo.getTree();
        return tree;
    }
}
