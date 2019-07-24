package com.janhe.core.SimpleFactory;

import com.janhe.core.SimpleFactory.factory.CarFactory;
import com.janhe.core.SimpleFactory.model.Car;

/**
 * @Auther: Jan 橙寂
 * @Date: 2019-7-24 11:12
 * @Description: 简单工厂模式测试
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {


        Car car = CarFactory.createBMCar();

        car.run();
    }
}
