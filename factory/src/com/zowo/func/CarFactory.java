package com.zowo.func;

import com.zowo.Car;

/**
 * 汽车工厂接口,每个工厂已具有生产产品的技能，有统一的产品出口
 *
 * @author DHC
 */
public interface CarFactory {

    /**
     * 制造汽车
     *
     * @return car
     */
    Car makeCar();
}
