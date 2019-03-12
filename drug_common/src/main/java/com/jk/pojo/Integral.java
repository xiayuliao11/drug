package com.jk.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


   //积分查询表
@Data
@AllArgsConstructor   //有参构造方法
@NoArgsConstructor    //无参构造方法
@Document(collection="integral")
public class Integral {

    // //主键ID
      private String id;
      //兑换单ID
      private Integer exchangeId;
      //兑换商品名称
     private  String exchangeGoodname;
     //兑换数量
     private Integer exchangeNumber;
     //商品类型
     private Integer goodType;
     //库存结余
     private Integer inventoryNumber;
     //兑换积分
     private Integer exchangeTotal;
     //兑换时间
     @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date exchangeTime;
    //配送单状态
    private Integer dispatchingState;




}
