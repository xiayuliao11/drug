package com.jk.controller;

import com.jk.pojo.TreeBean;
import com.jk.service.TreeService;
import com.jk.service.TreeServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TreeController implements TreeService {

    @Autowired
    TreeServiceService treeServiceService;

    /**
     * 获得左侧树
     * @return
     */
    @Override
    @ResponseBody
  /*  @GetMapping("getTree")*/
    public List<TreeBean> getTree() {
        return treeServiceService.getTree();
    }
}
