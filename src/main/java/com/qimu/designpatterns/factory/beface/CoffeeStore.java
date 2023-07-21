package com.qimu.designpatterns.factory.beface;

import com.qimu.designpatterns.factory.abstract_factory.AmericanCoffee;
import com.qimu.designpatterns.factory.abstract_factory.Coffee;
import com.qimu.designpatterns.factory.abstract_factory.LatteCoffee;

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
        Coffee coffee = null;
        if ("american".equals(coffeeType)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(coffeeType)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("没有改咖啡");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
