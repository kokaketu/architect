package com.kokaketu.patterns.simplefactory.example1;

/**
 * @Description 手机工厂类
 * @Author ghj
 * @Date 2021/8/30 2:53 下午
 */
public class PhoneFactory {
    public static AbsPhone createPhone(String type) throws Exception {
        AbsPhone phone = null;
        switch (type) {
            case "Huawei":
                phone = new HuaweiPhone();
                break;
            case "Xiaomi":
                phone = new HuaweiPhone();
                break;
        }
        if (phone == null) {
            throw new Exception("incorrectParameters");
        }
        return phone;
    }
}
