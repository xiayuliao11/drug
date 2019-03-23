package com.jk.controller;

import com.jk.pojo.ShoppingCart;
import com.jk.pojo.UserBean;
import com.jk.service.OrderServiceFeign;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


@Controller
public class GoodController {

    //用户没有登录情况下商品存入redis中
    @Resource
    private RedisTemplate<String, ShoppingCart> redisTemplate;

    @Resource
    private RedisTemplate<String,String> redisTemplatea;





    @Resource
    private OrderServiceFeign orderServiceFeign;

    @ResponseBody
    @RequestMapping("redisAddGood")    //点击加入购物车按钮调的方法
    public void redisAddGood(ShoppingCart t, HttpServletRequest request, HttpServletResponse response,HttpSession session){
        //调用加购物车的方法，首先判断当前是否有用户登录，没有用户登录存在redis中，有用户登录直接存数据库

   /*     String uu = UUID.randomUUID().toString();  //随机生成uuid
        String keyuu="";
        redisTemplatea.opsForValue().set(keyuu,uu,5,TimeUnit.MINUTES);
       String us= redisTemplatea.opsForValue().get(keyuu);*/
        String user="";
        String b=redisTemplatea.opsForValue().get(user);
        Integer a=Integer.valueOf(b);

        //根据商品id，去查库存表的商品
        ShoppingCart s=orderServiceFeign.getShoppingCartKC(t.getId());
         t=s;
       // Cookie[] se=request.getCookies();

        if (a==0) {

         //  Cookie[] cookies = request.getCookies();
           //cookie里面有值则取出来，没值则为st=""
           String st = "";
           //cookie不为空的情况下，且上一次cookie的key和这一次cookie的key相等,否则的st的值就为空
        /*   if (cookies != null) {
               for (Cookie cookie : cookies) {
                   if (cookie.getName().equals("keyUUid")) {
                       st = cookie.getValue();     //取出uuid,赋给st
                   }

               }
           }*/
           //-------------------------
            String name="ke";
          if (redisTemplatea.hasKey(name)){
              st=redisTemplatea.opsForValue().get(name);
          }
            //------------------------


           //判断用户有没有cookie，cookie为空的情况下
           if (st.equals("")) {
               String uuid = UUID.randomUUID().toString();  //随机生成uuid
               //成功则返回替换的字符串，失败则返回原始字符串。(就是把uuid字符串中的—，换成"")
               String keyUUid = uuid.replaceAll("-", "");
              /* Cookie ShopingTemp = new Cookie("keyUUid", keyUUid);
               //设置cookie的时间
               ShopingTemp.setMaxAge(410381);
               ShopingTemp.setPath("/");
               //将cookie对象添加到response对象中，这样服务器在输出response对象中的内容时就会把cookie也输出到客户端浏览器
               response.addCookie(ShopingTemp);   */
               redisTemplate.opsForList().leftPush(keyUUid, t);
               redisTemplate.expire(keyUUid, 7, TimeUnit.DAYS);


               redisTemplatea.opsForValue().set(name,keyUUid,7, TimeUnit.DAYS);
           } else {
               //有cookie 查reid  包含或者不包含
               boolean tag = true;

               if (redisTemplate.hasKey(st)) {

                   List<ShoppingCart> shopingFormDb = redisTemplate.opsForList().range(st, 0, -1);   //参数0和-1指取全部的值
                   for (int i = 0; i < shopingFormDb.size(); i++) {
                       //判断当前商品是否存在，存在则在原来的商品数量上加1，不存在则新增一个商品
                       if (shopingFormDb.get(i).getId().equals(t.getId())) {
                           Integer spsl = shopingFormDb.get(i).getCount() + t.getCount();
                           Integer price=spsl*shopingFormDb.get(i).getUnitPrice();
                           shopingFormDb.get(i).setSubtotal(price);
                           shopingFormDb.get(i).setCount(spsl);
                           // 在集合的指定位置插入元素,如果指定位置已有元素，则覆盖，没有则新增，超过集合下标+n则会报错。
                           //这个str是个uuid
                           redisTemplate.opsForList().set(st, i, shopingFormDb.get(i));  //shopingFormDb.get(i)是一个对象
                           tag = false;
                       }
                   }
                   if (tag) {
                       //cookie不为空，redis购物车中没有相同的商品
                       redisTemplate.opsForList().leftPush(st, t);
                   }
               } else {
                   //我认为这是多写的
                   redisTemplate.opsForList().leftPush(st, t);

               }
           }

       }
        //---------------------------
        else {

            List <ShoppingCart> shulist=orderServiceFeign.loggouwuche(a);
           //登录情况下往数据库新增
            t.setUserid(a);
            boolean mm=true;
            System.out.println(t.getId());
              for (int j=0;j<shulist.size();j++){
                    if (shulist.get(j).getId().equals(t.getId())){
                        shulist.get(j).setCount(shulist.get(j).getCount()+1);
                        shulist.get(j).setSubtotal(shulist.get(j).getCount()*t.getUnitPrice());
                        orderServiceFeign.logdeleteItem(shulist.get(j).getId(),a);
                        orderServiceFeign.addShoppingCart(shulist.get(j));
                        mm=false;
                    }
              }
               if (mm){
                   orderServiceFeign.addShoppingCart(t);
               }

       }
    }

    //未登录情况下查询reids购物车数据
    @ResponseBody
    @RequestMapping("getShopingTemp")
    public List<ShoppingCart> getShopingTemp(HttpServletRequest request,HttpSession session){

        List<ShoppingCart> list=null;
        String st="";


     //  redisTemplate.opsForList().leftPush(st, li);
       // Cookie[] cookies = request.getCookies();

     /*   if (cookies!=null){
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("keyUUid")){
                    st=cookie.getName();
                }
            }
        }*/
        String name="ke";
        if (redisTemplatea.hasKey(name)){
            st=redisTemplatea.opsForValue().get(name);
        }

        if (!st.equals("")){
            list = redisTemplate.opsForList().range(st, 0, -1);
        }
        System.out.println(list.get(0));
    // redisTemplate.delete(st);
        return list;
    }

        //未登录情况下对购物车的商品数量做加减
    @ResponseBody
    @RequestMapping("meiupdateSl")
    public String meiupdateSl(Integer state,Integer id){
        List <ShoppingCart> list=null;
        ShoppingCart shopp=null;
        String st="";
        String name="ke";
        if (redisTemplatea.hasKey(name)){
            st=redisTemplatea.opsForValue().get(name);
        }

        list =redisTemplate.opsForList().range(st,0,-1);
        redisTemplate.delete(st);
        //1代表数量加

            for (int i=0;i<list.size();i++){
                  if (list.get(i).getId().equals(id)){
                      shopp=list.get(i);
                      list.remove(list.get(i));
                  }
            }
        if (state==1){
          shopp.setCount(shopp.getCount()+1);
        }
        if (state==2){
            shopp.setCount(shopp.getCount()-1);
        }
            shopp.setSubtotal(shopp.getCount()*shopp.getUnitPrice());
            list.add(shopp);

            for (int j=0;j<list.size();j++){
                redisTemplate.opsForList().leftPush(st,list.get(j));
            }
        return "1";
    }

    //没有登录的情况下删除购物车数据
    @ResponseBody
    @RequestMapping("meideleteItem")
    public String meideleteItem(Integer ids){
        List <ShoppingCart> list=null;
        ShoppingCart shopp=null;

                String st="";
                String name="ke";
                if (redisTemplatea.hasKey(name)){
                    st=redisTemplatea.opsForValue().get(name);
                }

        list =redisTemplate.opsForList().range(st,0,-1);
        redisTemplate.delete(st);

        for (int i=0;i<list.size();i++){
            if (list.get(i).getId().equals(ids)){
                shopp=list.get(i);
                list.remove(list.get(i));
            }
        }
        for (int j=0;j<list.size();j++){
            redisTemplate.opsForList().leftPush(st,list.get(j));
        }
        return "1";
    }

    //选中的结算
    @ResponseBody
    @RequestMapping("jieSuanCheckPrice")
   public String jieSuanCheckPrice(String ids){

        List <ShoppingCart> list=null;
        ShoppingCart shopp=null;

        String st="";
        String name="ke";
        if (redisTemplatea.hasKey(name)){
            st=redisTemplatea.opsForValue().get(name);
        }

        list =redisTemplate.opsForList().range(st,0,-1);
        String arr[]=ids.split(",");


        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getId());
            for (int j=0;j<arr.length;j++){
                System.out.println(arr[j]);
                    if (arr[j].equals(list.get(i).getId())){
                        list.add(list.get(i));
                    }
            }
        }
      System.out.println(list);

      return "你好，请先登录";
    }






    //----------------用户登录的情况下将reids中同步到数据库
    public void loninGood(){

        String st="";
        String name="ke";
        if (redisTemplatea.hasKey(name)){
            st=redisTemplatea.opsForValue().get(name);
        }
        redisTemplatea.delete(name);
      //  String st="";
    /*    for (Cookie cookie : cookies) {
               if (cookie.getName().equals("keyUUid")){
                   st=cookie.getValue();
               }
        }*/
        String user="";
        String b=redisTemplatea.opsForValue().get(user);
        Integer a=Integer.valueOf(b);
        List <ShoppingCart> shulist=orderServiceFeign.loggouwuche(a);

        if (!st.equals("")){
        List <ShoppingCart> list=redisTemplate.opsForList().range(st,0,-1);
      boolean jia=true;
        for (int i=0;i<list.size();i++){
            for (int j=0;j<shulist.size();j++){
                      if (list.get(i).getId().equals(shulist.get(j).getId())){
                          list.get(i).setCount(list.get(i).getCount()+shulist.get(j).getCount());
                          list.get(i).setSubtotal(list.get(i).getCount()*list.get(i).getUnitPrice());
                          list.get(i).setUserid(a);
                          orderServiceFeign.logdeleteItem(list.get(i).getId(),a);
                          orderServiceFeign.addShoppingCart(list.get(i));
                          jia=false;
                      }
            }
               if (jia){
                   orderServiceFeign.addShoppingCart(list.get(i));
               }

        }
         /*   for (ShoppingCart shoppingCart : list) {
                  shoppingCart.setUserid(a);
                orderServiceFeign.addShoppingCart(shoppingCart);
            }*/
            redisTemplate.delete(st);
        }


    }

    //用户登录情况下对购物车的商品数量做加减
    @ResponseBody
    @RequestMapping("logupdateSl")
    public String logupdateSl(Integer state,Integer id){
        String user="";
        String b=redisTemplatea.opsForValue().get(user);
        Integer a=Integer.valueOf(b);

        orderServiceFeign.logupdateSl(state,id,a);
        return "1";
    }
    //用户登录下选中结算总价
    @ResponseBody
    @RequestMapping("logjieSuanCheckPrice")
    public Integer logjieSuanCheckPrice(String ids){
        String user="";
        String b=redisTemplatea.opsForValue().get(user);
        Integer a=Integer.valueOf(b);

      List <ShoppingCart>  list=orderServiceFeign.logjieSuanCheckPrice(ids,a);
      Integer price=0;
        for (ShoppingCart shoppingCart : list) {
            price+=shoppingCart.getUnitPrice()*shoppingCart.getCount();
        }

        return price;
    }

    //用户登录情况下查询购物车数据
    @ResponseBody
    @RequestMapping("loggouwuche")
    public List <ShoppingCart> loggouwuche(){
        loninGood();
        //传用户的ID
        String user="";
        String b=redisTemplatea.opsForValue().get(user);
        Integer a=Integer.valueOf(b);
        List <ShoppingCart> list=orderServiceFeign.loggouwuche(a);
        return list;
    }

   //用户登录下删除数据
    @ResponseBody
    @RequestMapping(value ="logdeleteItem",method = RequestMethod.DELETE)
    public String logdeleteItem(Integer id){
        String user="";
        String b=redisTemplatea.opsForValue().get(user);
        Integer a=Integer.valueOf(b);

        orderServiceFeign.logdeleteItem(id,a);
        return "1";
    }


    @ResponseBody
    @RequestMapping(value = "getQuery",method = RequestMethod.GET)
    public UserBean getQuery(String account, String userPwd, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
        UserBean userBean = orderServiceFeign.getQuery(account, userPwd);
        if (userBean == null) {
            String user="";
            redisTemplatea.opsForValue().set(user,0+"");
            return null;

        } else {
            String user="";
            redisTemplatea.opsForValue().set(user,userBean.getId()+"");
            String b=redisTemplatea.opsForValue().get(user);
            Integer a=Integer.valueOf(b);
            System.out.println(a);
            return userBean;
        }
    }
    @ResponseBody
    @RequestMapping("getuserid")
    public Integer getuserid(){
        String user="";
      //  redisTemplatea.delete(user);
        String b=redisTemplatea.opsForValue().get(user);
        Integer a=Integer.valueOf(b);
        return a;
    }

}
