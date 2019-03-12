package com.jk.service;

import com.jk.pojo.GoodsReturned;
import com.jk.pojo.SendPage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;


public interface OrderService {


    @RequestMapping("getGoodsReturned")  //@RequestParam("pageSize") Integer pageSize, @RequestParam("offset") Integer offset
    SendPage getGoodsReturned( Map<String, Object> map);

    @GetMapping("getGoodsReturnedss")
    List<GoodsReturned> getGoodsReturnedss(GoodsReturned t);

    @RequestMapping("getDemand")
    SendPage getDemand(Map<String, Object> map);
}
