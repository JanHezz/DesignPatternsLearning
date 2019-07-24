package com.janhe.core.abstractFactory.factory.impl;

import com.janhe.core.abstractFactory.factory.CarFactory;
import com.janhe.core.abstractFactory.model.Engine;
import com.janhe.core.abstractFactory.model.Wheel;
import com.janhe.core.abstractFactory.model.impl.LandRoverEngine;
import com.janhe.core.abstractFactory.model.impl.LandRoverWheel;

/**
 * @Auther: Jan 橙寂
 * @Date: 2019-7-24 11:02
 * @Description: 路虎车制造工厂
 * @Version: 1.0
 */
public class LandRoverCarFactory implements CarFactory {



    public Engine createEngine() {
        return new LandRoverEngine() ;
    }

    public Wheel createWheel() {
        return new LandRoverWheel();
    }
}
