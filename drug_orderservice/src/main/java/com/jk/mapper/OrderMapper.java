package com.jk.mapper;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface OrderMapper {


/*    @Select("select * from goods_returned_note")
    @Results({
            @Result(id = true,column = "id",property = "id"),    //主键id后面加true
            @Result(column = "order_number",property = "orderNumber"),
            @Result(column = "sales_return_number",property = "salesReturnNumber"),
            @Result(column = "sales_return_commddtiy",property = "salesReturnCommddtiy"),
            @Result(column = "sales_return_time",property = "salesReturnTime"),
            @Result(column = "procurer",property = "procurer"),
            @Result(column = "proposer",property = "proposer"),
            @Result(column = "sales_return_price",property = "salesReturnPrice"),
            @Result(column = "sales_return_state",property = "state"),
    })*/
    List<GoodsReturned> getGoodsReturned(GoodsReturned t);


    @Select("select * from goods_returned_note")
    @Results({
            @Result(id = true,column = "id",property = "id"),    //主键id后面加true
            @Result(column = "order_number",property = "orderNumber"),
            @Result(column = "sales_return_number",property = "salesReturnNumber"),
            @Result(column = "sales_return_commddtiy",property = "salesReturnCommddtiy"),
            @Result(column = "sales_return_time",property = "salesReturnTime"),
            @Result(column = "procurer",property = "procurer"),
            @Result(column = "proposer",property = "proposer"),
            @Result(column = "sales_return_price",property = "salesReturnPrice"),
            @Result(column = "sales_return_state",property = "state"),
    })
    List<GoodsReturned> getGoodsReturnedss(@Param("t") GoodsReturned t);

    List<Demand> getDemand(Demand t);

    @Select("select * from drug_type where pid=#{pid}")
    List<DaugType> getDaugType(Integer pid);
    @Select("select * from drug_area where pid=#{id}")
    List<RegionType> getRegionType(Integer id);

    void addDemand(Demand t);

    void addShoppingCart(ShoppingCart shoppingCart);
     @Update("Update drug_shoppingcart set count=count+1 where id=#{id} and userid=#{a}")
    void updateS1(@Param("id") Integer id,@Param("a") Integer a);
    @Update("Update drug_shoppingcart set count=count-1 where id=#{id} and userid=#{a}")
    void updateS2(@Param("id") Integer id,@Param("a") Integer a);

    @Select("select * from drug_shoppingcart where id=#{id} and userid=#{a}")
    ShoppingCart getById(@Param("id") Integer id,@Param("a") Integer a);

    @Select("select * from drug_shoppingcart where id in (${ids}) and userid=#{a}")
    List<ShoppingCart> logjieSuanCheckPrice(@Param("ids") String ids,@Param("a") Integer a);

    @Select("select * from drug_shoppingcart where userid=#{yhid}")
    List<ShoppingCart> loggouwuche(Integer yhid);

    @Delete("Delete from drug_shoppingcart where id=#{id} and userid=#{a}")
    void logdeleteItem(@Param("id") Integer id,@Param("a") Integer a);

    @Update("Update drug_shoppingcart set subtotal=#{hjprice} where id=#{id} and userid=#{a}")
    void updateHJprice(@Param("id") Integer id,@Param("hjprice") Integer hjprice,@Param("a") Integer a);

    @Select("select * from drug_shoppingcart_kc where id=#{id}")
    ShoppingCart getShoppingCartKC(Integer id);

    @Select("select * from t_userbean where account=#{account} and userPwd=#{userPwd}")
    UserBean getQuery(@Param("account") String account, @Param("userPwd") String userPwd);
}
