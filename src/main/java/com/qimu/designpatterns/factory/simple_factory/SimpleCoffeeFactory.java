package com.qimu.designpatterns.factory.simple_factory;



/**
 * @Author: QiMu
 * @Date: 2023/07/21 08:10:19
 * @Version: 1.0
 * @Description: 简单咖啡工厂类,用来生产咖啡
 */
public class SimpleCoffeeFactory {
    /**
     * 创建咖啡
     *
     * @param coffeeType 咖啡类型
     * @return {@link Coffee}
     */
    public  Coffee createCoffee(String coffeeType) {
        Coffee coffee;
        if ("american".equals(coffeeType)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(coffeeType)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("没有改咖啡");
        }
        return coffee;
    }
}
