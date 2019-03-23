package com.jk.service;

import com.jk.pojo.*;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("loninGood")
    void addShoppingCart(ShoppingCart shoppingCart);

    @GetMapping("logupdateSl")
    void logupdateSl(@RequestParam("state") Integer state,@RequestParam("id") Integer id,@RequestParam("a") Integer a);

    @GetMapping("logjieSuanCheckPrice")
    List<ShoppingCart> logjieSuanCheckPrice(@RequestParam("ids") String ids,@RequestParam ("a") Integer a);

    @GetMapping("loggouwuche")
    List<ShoppingCart> loggouwuche(@RequestParam("yhid")Integer yhid);

    @DeleteMapping("logdeleteItem")
    void logdeleteItem(@RequestParam("id") Integer id,@RequestParam("a") Integer a);

    @GetMapping("getShoppingCartKC")
    ShoppingCart getShoppingCartKC(@RequestParam("id") Integer id);

    @GetMapping("getQuery")
    UserBean getQuery(@RequestParam("account") String account,@RequestParam("userPwd") String userPwd);
}
