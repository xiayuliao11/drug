package com.jk.pojo;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


                 //商品评价表
@Data
public class GoodsEvaluate implements Serializable {
    //主键ID
    private Integer id;
    //商品名称
    private String commddtiyName;
    //供应商
    private String supplier;
    //服务评价
    private String serveEvaluate;
    //质量评价
    private String qualityEvaluate;
    //发货评价
    private String deliverEvaluate;
    //综合评分
    private String grade;
    //评价留言
    private String comment;
    //评价日期
    /*    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")*/
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String evaluateTime;


}

