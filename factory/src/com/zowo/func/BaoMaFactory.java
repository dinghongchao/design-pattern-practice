package com.zowo.func;

import com.zowo.BaoMa;
import com.zowo.Car;

/**
 * 宝马车辆工厂
 *
 * @author DHC
 */
public class BaoMaFactory implements CarFactory {

    @Override
    public Car makeCar() {
        return new BaoMa();
    }
}
