package com.qimu.designpatterns.factory.method_factory;

/**
 * @Author: QiMu
 * @Date: 2023/07/21 08:57:34
 * @Version: 1.0
 * @Description: 咖啡工厂
 */
public interface CoffeeFactory {
    /**
     * 创建咖啡
     *
     * @return {@link Coffee}
     */
    Coffee createCoffee();
}
