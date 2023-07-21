package com.qimu.designpatterns.factory.abstract_factory;

import com.qimu.designpatterns.factory.method_factory.AmericanCoffee;
import com.qimu.designpatterns.factory.method_factory.Coffee;

/**
 * @Author: QiMu
 * @Date: 2023/07/21 09:45:57
 * @Version: 1.0
 * @Description: 美式甜点工厂：生产美式咖啡和抹茶慕斯甜品
 */
public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MochaMousse();
    }
}
