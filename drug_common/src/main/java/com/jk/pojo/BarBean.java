package com.jk.pojo;

import lombok.Data;

import java.util.List;

@Data
public class BarBean {
    //主标题
    private String text;
    //副标题
    private String subtext;
    //X轴名称
    private List<String> xAxisData;

    //柱状图和折线图组合
    private List<BarSeries> series;
}
