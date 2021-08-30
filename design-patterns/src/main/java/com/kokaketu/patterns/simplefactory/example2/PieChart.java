package com.kokaketu.patterns.simplefactory.example2;

import java.util.Map;

/**
 * @Description 饼状图
 * @Author ghj
 * @Date 2021/8/30 3:03 下午
 */
public class PieChart extends Chart{
    @Override
    public void setData(Map<String, Float> data) {
        super.setData(data);
    }

    @Override
    public void showChart() {
        //TODO
    }
}
