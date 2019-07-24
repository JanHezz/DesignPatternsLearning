package com.janhe.core.methodfactory;

import com.janhe.core.methodfactory.factory.CarFactory;
import com.janhe.core.methodfactory.factory.impl.BMWCarFactory;
import com.janhe.core.methodfactory.model.Car;

/**
 * @Auther: Jan 橙寂
 * @Date: 2019-7-24 11:12
 * @Description:
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        CarFactory factory=new BMWCarFactory();

        Car car = factory.createCar();

        car.run();
    }
}
