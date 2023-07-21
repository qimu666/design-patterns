package com.qimu.designpatterns.factory.simple_factory;

/**
 * @Author: QiMu
 * @Date: 2023/07/21 07:48:06
 * @Version: 1.0
 * @Description: 拿铁咖啡
 */
public class LatteCoffee extends Coffee {
    @Override
    public String getCoffeeName() {
        return "拿铁咖啡";
    }
}
