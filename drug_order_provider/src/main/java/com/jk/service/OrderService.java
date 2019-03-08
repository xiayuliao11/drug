package com.jk.service;

import com.jk.pojo.SaleBean;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

public interface OrderService {
    HashMap<String, Object> findList(@RequestParam("page") Integer page, @RequestParam("rows")Integer rows);
}
