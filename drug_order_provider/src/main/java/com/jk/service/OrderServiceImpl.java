package com.jk.service;

import com.jk.mapper.OrderMapper;
import com.jk.pojo.SaleBean;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@Service
public class OrderServiceImpl  implements OrderService {

    @Autowired
    private OrderMapper OrderMapper;

    @Override
    public HashMap<String, Object> findList(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows) {
        HashMap<String, Object> param = new HashMap<>();
        int total = OrderMapper.findCount();
        int start = (page - 1) * rows;
        List<SaleBean> list = OrderMapper.findPage(start, rows);
        param.put("total", total);
        param.put("rows", list);
        return param;
    }
}
