package com.janhe.core.abstractFactory;

import com.janhe.core.abstractFactory.factory.CarFactory;
import com.janhe.core.abstractFactory.factory.impl.BMWCarFactory;
import com.janhe.core.abstractFactory.model.Engine;
import com.janhe.core.abstractFactory.model.Wheel;

/**
 * @Auther: Jan 橙寂
 * @Date: 2019-7-24 11:12
 * @Description:
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        CarFactory factory=new  BMWCarFactory();

        Engine engine = factory.createEngine();
        Wheel wheel = factory.createWheel();

        engine.run();

        wheel.run();
    }
}
