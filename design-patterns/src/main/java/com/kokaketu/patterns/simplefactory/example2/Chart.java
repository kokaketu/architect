package com.kokaketu.patterns.simplefactory.example2;

import java.util.Map;

/**
 * @Description 统计图抽象类
 * @Author ghj
 * @Date 2021/8/30 2:58 下午
 */
public abstract class Chart {
    public void setData(Map<String, Float> data) {
        // do something same
    }

    public abstract void showChart();
}
