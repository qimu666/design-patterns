package com.qimu.designpatterns.factory.beface;

import com.qimu.designpatterns.factory.abstract_factory.Coffee;

/**
 * @Author: QiMu
 * @Date: 2023/07/21 07:56:50
 * @Version: 1.0
 * @Description: 咖啡端
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
