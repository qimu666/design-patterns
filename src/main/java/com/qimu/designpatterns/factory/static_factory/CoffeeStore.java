package com.qimu.designpatterns.factory.static_factory;

import com.qimu.designpatterns.factory.static_factory.Coffee;
import com.qimu.designpatterns.factory.static_factory.SimpleCoffeeFactory;

/**
 * @Author: QiMu
 * @Date: 2023/07/21 07:51:53
 * @Version: 1.0
 * @Description: 咖啡店
 */
public class CoffeeStore {

    /**
     * 咖啡订单
     *
     * @param coffeeType 咖啡类型
     * @return {@link Coffee}
     */
    public Coffee coffeeOrder(String coffeeType) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(coffeeType);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
