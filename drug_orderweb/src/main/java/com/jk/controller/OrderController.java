package com.jk.controller;


import com.jk.pojo.*;
import com.jk.service.OrderServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Controller
public class OrderController {
    @Resource
    private OrderServiceFeign orderServiceFeign;

    //跳转视图
    @RequestMapping("toView")
    public String toView(String name){

        return name;
    }

    //退货订单查询
    @ResponseBody
    @RequestMapping(value = "getGoodsReturned",method = RequestMethod.GET)
  //  @RequestMapping("getGoodsReturned")
    public SendPage getGoodsReturned(GoodsReturned t,Integer pageSize, Integer offset){
        Map<String, Object> map = new HashMap<>();
        map.put("m1",pageSize);
        map.put("m2",offset);
        map.put("m3",t);

        System.out.println( map.get("m1"));
        SendPage list=orderServiceFeign.getGoodsReturned(map);
        return list;
    }
    //调查
    @ResponseBody
    @RequestMapping("getGoodsReturnedss")
    public SendPage getGoodsReturnedss(GoodsReturned t){
        List <GoodsReturned> li=orderServiceFeign.getGoodsReturnedss(t);
        SendPage list = new SendPage(10, li);
       return list;
    }


    @Autowired
    MongoTemplate mongoTemplate;

    //评价管理查询
    @ResponseBody
    @RequestMapping(value = "getGoodsEvaluate",method = RequestMethod.GET)
    public SendPage getGoodsEvaluate(GoodsEvaluate t, Integer pageSize, Integer offset){
        Query query = new Query();
        if(!StringUtils.isEmpty(t.getSupplier())){
            query.addCriteria(Criteria.where("supplier").regex(t.getSupplier()));
        }

        //-------------------------日期调查开始
        if(t.getDatesta()!=null||t.getDateend()!=null){
            if(t.getDatesta()!=null&&t.getDateend()==null){
                query.addCriteria(Criteria.where("evaluateTime").gte(t.getDatesta()));
            }
            if(t.getDatesta()==null&&t.getDateend()!=null){
                query.addCriteria(Criteria.where("evaluateTime").lte(t.getDateend()));
            }
            if(t.getDateend()!=null&&t.getDateend()!=null){
                query.addCriteria(Criteria.where("evaluateTime").gte(t.getDatesta()).lte(t.getDateend()));
            }
        }
        //-------------------------日期调查结束

    //    int sum=(int) mongoTemplate.count(query, GoodsEvaluate.class);
        // skipNum = (pageNow-1)*pageSize
        //  int pageNow =  offset /  pageSize+1;
      //  query.skip(offset);
      //  query.limit(pageSize); // 每页展示的条数
        List <GoodsEvaluate> list=mongoTemplate.find(query,GoodsEvaluate.class);
        SendPage sendPage = new SendPage(list.size(),list);
        return sendPage;
    }


    //积分查询
    @ResponseBody
    @RequestMapping(value = "getIntegral",method = RequestMethod.GET)
    public SendPage getGoodsEvaluate(Integral t, Integer pageSize, Integer offset){
        Query query = new Query();
       // int sum=(int) mongoTemplate.count(query, Integral.class);
        // skipNum = (pageNow-1)*pageSize
        //  int pageNow =  offset /  pageSize+1;
       /* query.skip(offset);
        query.limit(pageSize); // 每页展示的条数*/
        List <Integral> list=mongoTemplate.find(query,Integral.class);
        SendPage sendPage = new SendPage(list.size(),list);
        return sendPage;
    }
    //查看积分
    @ResponseBody
    @RequestMapping(value = "updateItem",method = RequestMethod.GET)
    public Integral chaUpdateItem(String id){
        Integral li=mongoTemplate.findById(id,Integral.class);

        return li;
    }



    //积分获取查询
    @ResponseBody
    @RequestMapping(value = "getIntegralGain",method = RequestMethod.GET)
    public SendPage getGoodsEvaluate(IntegralGain t, Integer pageSize, Integer offset){
        Query query = new Query();
        // int sum=(int) mongoTemplate.count(query, IntegralGain.class);
        // skipNum = (pageNow-1)*pageSize
        //  int pageNow =  offset /  pageSize+1;
       /* query.skip(offset);
        query.limit(pageSize); // 每页展示的条数*/
        List <IntegralGain> list=mongoTemplate.find(query,IntegralGain.class);
        SendPage sendPage = new SendPage(list.size(),list);
        return sendPage;
    }






    @Resource
    private RedisTemplate<String,DrugShortage> redisTemplate;

    //缺药登记

    @ResponseBody
    @RequestMapping("addDrugShortage")
    public String addDrugShortage(DrugShortage t){
        List<DrugShortage> shopingFormDb = null;
        String str = "weiyi";
        t.setLinkman("王阳明");
        t.setPhone("13693478321");

            if (redisTemplate.hasKey(str)) {
                shopingFormDb = redisTemplate.opsForList().range(str, 0, -1);
                int id = shopingFormDb.size();
                t.setId(id + 1);
                redisTemplate.opsForList().leftPush(str, t);
            } else {
                t.setId(1);
                redisTemplate.opsForList().leftPush(str, t);
            }

        return "1";
    }

    //delDrugShortage
    @ResponseBody
    @RequestMapping("delDrugShortage")
    public String delDrugShortage(Integer ids){
        String str="weiyi";
        List<DrugShortage>   shopingFormDb = redisTemplate.opsForList().range(str, 0, -1);
        for (int i = 0; i < shopingFormDb.size(); i++) {

            if (shopingFormDb.get(i).getId()==ids) {

            }
        }
        return "1";
    }
    @ResponseBody
    @RequestMapping(value = "getDrugShortage",method = RequestMethod.GET)
    public SendPage getDrugShortage(Integer pageSize, Integer offset){
   /*     DrugShortage t1= new DrugShortage();
        DrugShortage t2= new DrugShortage();
        DrugShortage t3= new DrugShortage();
        t1.setId(1);
        t1.setCommddtiyName("莲花");
        t1.setManufacturer("海蓝制药");
        t1.setSpecification("10克*10袋");
        t1.setTerritory("华中--武汉");
        t1.setLinkman("王刚");
        t1.setPhone("13635806564");

        t2.setId(2);
        t2.setCommddtiyName("蒲公英");
        t2.setManufacturer("明英制药");
        t2.setSpecification("5克*10袋");
        t2.setTerritory("西南--广西");
        t2.setLinkman("王明");
        t2.setPhone("13635806378");

        t3.setId(3);
        t3.setCommddtiyName("花藻");
        t3.setManufacturer("大唐制药");
        t3.setSpecification("20克*10袋");
        t3.setTerritory("华中--郑州");
        t3.setLinkman("孟歧");
        t3.setPhone("13635805498");
*/
        String str="weiyi";
     /*   redisTemplate.opsForList().leftPush(str, t1);
        redisTemplate.opsForList().leftPush(str, t2);
        redisTemplate.opsForList().leftPush(str, t3);*/
        redisTemplate.expire(str,30, TimeUnit.SECONDS);
    List <DrugShortage> list= redisTemplate.opsForList().range(str, 0, -1);

        SendPage sendPage = new SendPage(list.size(), list);
        return sendPage;
    }

    //查询求购信息
    @ResponseBody
    @RequestMapping(value = "getDemand",method = RequestMethod.GET)
    public SendPage getDemand(Demand t,Integer pageSize, Integer offset){
        Map<String, Object> map = new HashMap<>();
        map.put("a1",pageSize);
        map.put("a2",offset);
        map.put("a3",t);
        SendPage list=orderServiceFeign.getDemand(map);
        return list;
    }
}
