package com.qimu.designpatterns.factory.method_factory;

/**
 * @Author: QiMu
 * @Date: 2023/07/21 07:56:50
 * @Version: 1.0
 * @Description: 工厂方法模式:咖啡端
 */
public class CoffeeClient {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.setCoffeeFactory(new AmericanCoffeeFactory());
        Coffee coffee = coffeeStore.coffeeOrder();
        System.out.println(coffee.getCoffeeName());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        coffeeStore.setCoffeeFactory(new LatteCoffeeFactory());
        Coffee coffee2 = coffeeStore.coffeeOrder();
        System.out.println(coffee2.getCoffeeName());
    }
}
