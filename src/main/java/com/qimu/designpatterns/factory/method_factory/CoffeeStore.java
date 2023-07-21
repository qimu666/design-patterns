package com.qimu.designpatterns.factory.method_factory;


/**
 * @Author: QiMu
 * @Date: 2023/07/21 07:51:53
 * @Version: 1.0
 * @Description: 咖啡店
 */
public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    /**
     * 咖啡订单
     *
     * @return {@link Coffee}
     */
    public Coffee coffeeOrder() {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
