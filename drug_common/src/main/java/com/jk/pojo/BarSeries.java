package com.jk.pojo;

import lombok.Data;

import java.util.List;

@Data
public class BarSeries {
    //这个封装类的名字不能随便起，一定要和 yAxis--->series名字一样
    String name;
    String type;
    List<Integer> data;
}
