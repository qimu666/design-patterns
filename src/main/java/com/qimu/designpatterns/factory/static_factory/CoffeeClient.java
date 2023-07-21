package com.qimu.designpatterns.factory.static_factory;


/**
 * @Author: QiMu
 * @Date: 2023/07/21 07:56:50
 * @Version: 1.0
 * @Description: 简单工厂模式:咖啡端
 */
public class CoffeeClient {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        // 购买咖啡
        Coffee coffee = coffeeStore.coffeeOrder("latte");
        System.out.println(coffee.getCoffeeName());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        Coffee coffee2 = coffeeStore.coffeeOrder("american");
        System.out.println(coffee2.getCoffeeName());
    }
}
