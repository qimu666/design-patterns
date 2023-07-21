package com.qimu.designpatterns.factory.simple_factory;

/**
 * @Author: QiMu
 * @Date: 2023/07/21 07:50:13
 * @Version: 1.0
 * @Description: 美式咖啡
 */
public class AmericanCoffee extends Coffee {
    @Override
    public String getCoffeeName() {
        return "美式咖啡";
    }
}
