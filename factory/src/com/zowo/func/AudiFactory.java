package com.zowo.func;

import com.zowo.Audi;
import com.zowo.Car;

/**
 * Audi车辆工厂
 *
 * @author DHC
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car makeCar() {
        return new Audi();
    }
}
