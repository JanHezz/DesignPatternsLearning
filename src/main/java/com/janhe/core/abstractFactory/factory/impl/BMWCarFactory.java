package com.janhe.core.abstractFactory.factory.impl;

import com.janhe.core.abstractFactory.factory.CarFactory;
import com.janhe.core.abstractFactory.model.Wheel;
import com.janhe.core.abstractFactory.model.Engine;
import com.janhe.core.abstractFactory.model.impl.BMWEngine;
import com.janhe.core.abstractFactory.model.impl.BMWheel;

/**
 * @Auther: Jan 橙寂
 * @Date: 2019-7-24 11:01
 * @Description: 宝马车制造工厂
 * @Version: 1.0
 */
public class BMWCarFactory implements CarFactory {


    public Engine createEngine() {
        return new BMWEngine();
    }

    public Wheel createWheel() {
        return new BMWheel();
    }
}
