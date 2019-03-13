package com.jk.mapper;

import com.jk.pojo.DaugType;
import com.jk.pojo.Demand;
import com.jk.pojo.GoodsReturned;
import com.jk.pojo.RegionType;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

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
}
