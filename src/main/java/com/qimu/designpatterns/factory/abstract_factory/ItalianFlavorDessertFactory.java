package com.qimu.designpatterns.factory.abstract_factory;

import com.qimu.designpatterns.factory.method_factory.Coffee;
import com.qimu.designpatterns.factory.method_factory.LatteCoffee;

/**
 * @Author: QiMu
 * @Date: 2023/07/21 09:44:40
 * @Version: 1.0
 * @Description: 意大利风味点心工厂:生产拿铁咖啡和提拉米苏
 */
public class ItalianFlavorDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
