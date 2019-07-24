package com.janhe.core.SimpleFactory.factory;

import com.janhe.core.SimpleFactory.model.Car;
import com.janhe.core.SimpleFactory.model.impl.BMWCar;
import com.janhe.core.SimpleFactory.model.impl.LandRoverCar;

/**
 * @Auther: Jan 橙寂
 * @Date: 2019-7-24 10:57
 * @Description:
 * @Version: 1.0
 */
public class CarFactory {



    public static Car createBMCar()
    {
            return new BMWCar();

    }

    public static Car createLandRoverCar()
    {
        return new LandRoverCar();

    }
}
