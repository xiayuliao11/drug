package com.jk.controller;


import com.jk.pojo.SaleBean;
import com.jk.service.OrderServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;

@Controller
public class OrderController {

    @Autowired
    private OrderServiceFeign orderServiceFeign;

    /**
     * 销售页面
     * @return
     */
    @RequestMapping("selectSale")
    public String selectSale(){
        return "show";
    }

    /**
     * 分页查询
     * @param page
     * @param rows
     * @param bean
     * @return
     */
    @GetMapping("findList")
    @ResponseBody
    public HashMap<String, Object> findList(@RequestParam("page")Integer page, @RequestParam("rows") Integer rows){
        return orderServiceFeign.findList(page,rows);
    }





}
