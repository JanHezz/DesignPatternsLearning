package com.janhe.core.methodfactory.factory.impl;

import com.janhe.core.methodfactory.factory.CarFactory;
import com.janhe.core.methodfactory.model.Car;
import com.janhe.core.methodfactory.model.impl.BMWCar;

/**
 * @Auther: Jan 橙寂
 * @Date: 2019-7-24 11:01
 * @Description: 宝马车制造工厂
 * @Version: 1.0
 */
public class BMWCarFactory implements CarFactory {


    public Car createCar() {
        return new BMWCar();
    }
}
