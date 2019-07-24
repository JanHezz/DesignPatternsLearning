package com.janhe.core.abstractFactory.model.impl;

import com.janhe.core.abstractFactory.model.Engine;
import com.janhe.core.abstractFactory.model.Wheel;

/**
 * @Auther: Jan 橙寂
 * @Date: 2019-7-24 10:56
 * @Description:
 * @Version: 1.0
 */
public class LandRoverWheel implements Wheel {


    public void run() {

        System.out.println("LandRover Wheel is runnning ");
    }
}
