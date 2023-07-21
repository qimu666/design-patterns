package com.qimu.designpatterns.factory.abstract_factory;

/**
 * @Author: QiMu
 * @Date: 2023/07/21 07:50:19
 * @Version: 1.0
 * @Description: 咖啡抽象类
 */
public abstract class Coffee {
    /**
     * 获取咖啡名字
     *
     * @return {@link String}
     */
    public abstract String getCoffeeName();

    /**
     * 加入糖
     */
    public void addSugar() {
        System.out.println("加糖");
    }

    /**
     * 加入牛奶
     */
    public void addMilk() {
        System.out.println("加奶");
    }
}
