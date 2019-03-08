package com.jk.controller;

import com.jk.pojo.TreeBean;
import com.jk.service.TreeServerService;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TreeController implements TreeService {

    @Autowired
    TreeServerService treeServerService;

    /**
     * 查询左侧树
     * @return
     */
    @Override
    @GetMapping("getTree")
    @ResponseBody
    public List<TreeBean> getTree() {
        return treeServerService.getTree();
    }
}
