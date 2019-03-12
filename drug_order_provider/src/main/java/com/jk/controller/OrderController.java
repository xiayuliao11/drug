package com.jk.controller;

import com.jk.pojo.SaleBean;
import com.jk.service.OrderService;
import com.jk.service.ServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class OrderController implements ServiceApi {

    @Autowired
    private OrderService OrderService;


    @Override
    @ResponseBody
    public HashMap<String, Object> findList(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows) {
        return OrderService.findList(page,rows);
    }
}
