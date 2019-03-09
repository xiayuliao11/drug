package com.jk.pojo;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


                //退货订单表
@Data
public class GoodsReturned {
    //主键ID
    private Integer id;
    //订单号
    private String orderNumber;
    //退货单号
    private String salesReturnNumber;
    //退货商品
    private String salesReturnCommddtiy;
    //退货时间
    /*    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")*/
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date salesReturnTime;
    //采购商
    private String procurer;
    //申请人
    private String proposer;
    //退货金额
    private Double salesReturnPrice;
    //退货状态
    private Integer state;


}
