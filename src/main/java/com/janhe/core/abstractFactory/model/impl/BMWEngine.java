package com.janhe.core.abstractFactory.model.impl;

import com.janhe.core.abstractFactory.model.Engine;

/**
 * @Auther: Jan 橙寂
 * @Date: 2019-7-24 10:54
 * @Description:
 * @Version: 1.0
 */
public class BMWEngine implements Engine {


    public void run() {
        System.out.println("bao ma Engine is running");
    }
}
