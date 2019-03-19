package com.jk.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//import org.springframework.data.mongodb.core.mapping.Document;


//积分获取表
@Data
@AllArgsConstructor   //有参构造方法
@NoArgsConstructor    //无参构造方法
@Document(collection="integral_gain")
public class IntegralGain {

    //主键ID
    private String id;
    //获取时间
    /*   @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")*/
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date tdate;
    //行为
    private String behavior ;
    //获得积分
    private String gain;
    //积分余额
    private String balanceE ;



}
