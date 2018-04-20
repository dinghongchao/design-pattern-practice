package com.zowo.func;

import com.zowo.Car;
import com.zowo.DaZhong;

/**
 * 大众车辆工厂
 *
 * @author DHC
 */
public class DaZhongFactory implements CarFactory {
    @Override
    public Car makeCar() {
        return new DaZhong();
    }
}
