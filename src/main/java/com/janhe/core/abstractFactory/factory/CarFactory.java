package com.janhe.core.abstractFactory.factory;

import com.janhe.core.abstractFactory.model.Wheel;
import com.janhe.core.abstractFactory.model.Engine;

/**
 * @Auther: Jan 橙寂
 * @Date: 2019-7-24 10:57
 * @Description:
 * @Version: 1.0
 */
public interface CarFactory {


    /**
     * 创建引擎
     * @return
     */
    public Engine createEngine();


    /**
     * 创建轮子
     * @return
     */
    public Wheel createWheel();
}
