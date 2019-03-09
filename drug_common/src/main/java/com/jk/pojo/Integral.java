package com.jk.pojo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;


//积分查询表

@Data
public class Integral implements Serializable {

    // //主键ID
      private Integer id;
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
    private Date exchangeTime;
    //配送单状态
    private Integer dispatchingState;




}
