package com.jk.service;

import com.jk.pojo.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;


public interface OrderService {


    @RequestMapping("getGoodsReturned")  //@RequestParam("pageSize") Integer pageSize, @RequestParam("offset") Integer offset
    SendPage getGoodsReturned( Map<String, Object> map);

    @GetMapping("getGoodsReturnedss")
    List<GoodsReturned> getGoodsReturnedss(GoodsReturned t);

    @RequestMapping("getDemand")
    SendPage getDemand(Map<String, Object> map);

    @GetMapping("getDaugType")
    List<DaugType> getDaugType(@RequestParam("pid") Integer pid);

    @GetMapping("getRegionType")
    List<RegionType> getRegionType(@RequestParam("id") Integer id);

    @PostMapping("addDemand")
    void addDemand(Demand t);
}
