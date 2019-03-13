package com.jk.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//import org.springframework.data.mongodb.core.mapping.Document;


//商品评价表
@Data
@AllArgsConstructor   //有参构造方法
@NoArgsConstructor    //无参构造方法
@Document(collection="goods_evaluate")
public class GoodsEvaluate{
    //主键ID
    private String id;
    //商品名称
    private String commddtiyName;
    //采购商
    private String supplier;
    //服务评价
    private Integer serveEvaluate;
    //质量评价
    private Integer qualityEvaluate;
    //发货评价
    private Integer deliverEvaluate;
    //综合评分
    private String grade;
    //评价留言
    private String comment;
    //评价日期
    /*    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")*/
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date evaluateTime;


  //临时字段
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datesta;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateend;


}

