package com.janhe.core.methodfactory.factory.impl;

import com.janhe.core.methodfactory.factory.CarFactory;
import com.janhe.core.methodfactory.model.Car;
import com.janhe.core.methodfactory.model.impl.LandRoverCar;

/**
 * @Auther: Jan 橙寂
 * @Date: 2019-7-24 11:02
 * @Description: 路虎车制造工厂
 * @Version: 1.0
 */
public class LandRoverCarFactory implements CarFactory {


    public Car createCar() {
        return new LandRoverCar();
    }
}
