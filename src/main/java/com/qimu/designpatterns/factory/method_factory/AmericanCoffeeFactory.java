package com.qimu.designpatterns.factory.method_factory;

/**
 * @Author: QiMu
 * @Date: 2023/07/21 09:13:21
 * @Version: 1.0
 * @Description: 美式咖啡工厂
 */
public class AmericanCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
