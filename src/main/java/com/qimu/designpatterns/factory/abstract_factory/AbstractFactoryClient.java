package com.qimu.designpatterns.factory.abstract_factory;

import com.qimu.designpatterns.factory.method_factory.Coffee;

/**
 * @Author: QiMu
 * @Date: 2023/07/21 09:47:20
 * @Version: 1.0
 * @Description: 抽象工厂客户端
 */
public class AbstractFactoryClient {
    public static void main(String[] args) {
        // DessertFactory factory = new AmericanDessertFactory();
        DessertFactory factory = new ItalianFlavorDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getCoffeeName());
        dessert.show();
    }
}
