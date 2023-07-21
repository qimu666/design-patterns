package com.qimu.designpatterns.factory.abstract_factory;

import com.qimu.designpatterns.factory.method_factory.Coffee;

/**
 * @Author: QiMu
 * @Date: 2023/07/21 09:41:07
 * @Version: 1.0
 * @Description: 甜点工厂
 */
public interface DessertFactory {
    /**
     * 创建咖啡
     *
     * @return {@link Coffee}
     */
    Coffee createCoffee();

    /**
     * 创建甜点
     *
     * @return {@link Dessert}
     */
    Dessert createDessert();
}
