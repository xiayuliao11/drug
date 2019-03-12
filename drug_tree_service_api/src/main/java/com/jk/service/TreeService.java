package com.jk.service;


import com.jk.pojo.TreeBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*@RequestMapping("TreeService")*/
public interface TreeService {
    /***
     * 获取左侧树
     * @return
     */
    @GetMapping("getTree")
    List<TreeBean> getTree();
}
