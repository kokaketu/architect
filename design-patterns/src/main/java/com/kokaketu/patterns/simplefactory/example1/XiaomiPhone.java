package com.kokaketu.patterns.simplefactory.example1;

/**
 * @Description 小米手机
 * @Author ghj
 * @Date 2021/8/30 2:51 下午
 */
public class XiaomiPhone extends AbsPhone{
    private String name = "Xiaomi";

    @Override
    String getName() {
        return name;
    }

    @Override
    void setTheme() {
        //TODO
    }
}
