package com.qimu.designpatterns.factory.method_factory;

/**
 * @Author: QiMu
 * @Date: 2023/07/21 09:14:14
 * @Version: 1.0
 * @Description: 拿铁咖啡工厂
 */
public class LatteCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
