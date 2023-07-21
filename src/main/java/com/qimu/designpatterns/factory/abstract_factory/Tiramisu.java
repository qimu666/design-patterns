package com.qimu.designpatterns.factory.abstract_factory;

/**
 * @Author: QiMu
 * @Date: 2023/07/21 09:38:55
 * @Version: 1.0
 * @Description: 提拉米苏甜品类
 */
public class Tiramisu extends Dessert {
    @Override
    public void show() {
        System.out.println("提拉米苏");
    }
}
