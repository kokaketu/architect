package com.kokaketu.patterns.simplefactory.example1;

/**
 * @Description 华为手机
 * @Author ghj
 * @Date 2021/8/30 2:44 下午
 */
public class HuaweiPhone extends AbsPhone{
    private String name = "Huawei";

    @Override
    String getName() {
        return name;
    }

    @Override
    void setTheme() {
        //TODO
    }
}