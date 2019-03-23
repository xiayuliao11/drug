package com.jk.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.jk.mapper.OrderMapper;
import com.jk.pojo.*;
import com.jk.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;

    @ResponseBody
    public SendPage getGoodsReturned(@RequestBody Map<String, Object> map) {
        //pageSize, @RequestParam("offset")
       int pageSize= (int) map.get("m1");
        int offset= (int) map.get("m2");
        String m3 = JSONObject.toJSONString(map.get("m3"));
        GoodsReturned t = JSONObject.parseObject(m3, GoodsReturned.class);
       List<GoodsReturned> sum=orderMapper.getGoodsReturned(t);

        int pageNow=offset / pageSize + 1;
        PageHelper.startPage(pageNow,pageSize);
        List<GoodsReturned> list=orderMapper.getGoodsReturned(t);

        SendPage sendPage = new SendPage(sum.size(), list);
        return sendPage;
    }

    @ResponseBody
    @RequestMapping("getGoodsReturnedss")
    public List<GoodsReturned> getGoodsReturnedss(@RequestBody GoodsReturned t) {
        List<GoodsReturned> list=orderMapper.getGoodsReturnedss(t);
        return list;
    }

    @ResponseBody
    public SendPage getDemand(@RequestBody Map<String, Object> map) {
        int pageSize= (int) map.get("a1");
        int offset= (int) map.get("a2");
        String a3 = JSONObject.toJSONString(map.get("a3"));
        Demand t = JSONObject.parseObject(a3,Demand.class);
        List<Demand> sum=orderMapper.getDemand(t);

        int pageNow=offset / pageSize + 1;
        PageHelper.startPage(pageNow,pageSize);
        List<Demand> list=orderMapper.getDemand(t);

        SendPage sendPage = new SendPage(sum.size(), list);
        return sendPage;
    }

    @ResponseBody
    public List<DaugType> getDaugType(Integer pid) {
        List<DaugType>   list=orderMapper.getDaugType(pid);
        return list;
    }

    @ResponseBody
    public List<RegionType> getRegionType(Integer id) {
        List <RegionType>   list=orderMapper.getRegionType(id);
        return list;
    }

    @ResponseBody
    public void addDemand(@RequestBody Demand t) {

        orderMapper.addDemand(t);
    }

    @ResponseBody
    public void addShoppingCart(@RequestBody ShoppingCart shoppingCart) {
        orderMapper.addShoppingCart(shoppingCart);
    }

    @ResponseBody
    public void logupdateSl(Integer state, Integer id,Integer a) {
        if (state==1){
            //做加的操作
            //先修改数量，修改完以后在修改商品合计的价格
            orderMapper.updateS1(id,a);
            ShoppingCart li=orderMapper.getById(id,a);
            Integer hjprice=li.getCount()*li.getUnitPrice();
            orderMapper.updateHJprice(id,hjprice,a);
        }else {
            orderMapper.updateS2(id,a);
            ShoppingCart li=orderMapper.getById(id,a);
            Integer hjprice=li.getCount()*li.getUnitPrice();
            orderMapper.updateHJprice(id,hjprice,a);
        }

    }

    @ResponseBody
    public List<ShoppingCart> logjieSuanCheckPrice(String ids,Integer a) {
        List<ShoppingCart> list=orderMapper.logjieSuanCheckPrice(ids,a);
        return list;
    }

    @ResponseBody
    public List<ShoppingCart> loggouwuche(Integer yhid) {
        List<ShoppingCart> list=orderMapper.loggouwuche(yhid);
        return list;
    }

    @ResponseBody
    public void logdeleteItem(Integer id,Integer a) {
        orderMapper.logdeleteItem(id,a);
    }

    @ResponseBody
    public ShoppingCart getShoppingCartKC(Integer id) {
        ShoppingCart s= orderMapper.getShoppingCartKC(id);
        return s;
    }

    @ResponseBody
    public UserBean getQuery(String account, String userPwd) {
        return orderMapper.getQuery(account,userPwd);
    }
}
