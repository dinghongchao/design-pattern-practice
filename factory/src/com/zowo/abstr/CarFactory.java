package com.zowo.abstr;

import com.zowo.Car;
import com.zowo.func.AudiFactory;
import com.zowo.func.BaoMaFactory;
import com.zowo.func.DaZhongFactory;

public class CarFactory extends AbstractCarFactory {
    @Override
    public Car getAudiCar() {
        return new AudiFactory().makeCar();
    }

    @Override
    public Car getBaoMaCar() {
        return new BaoMaFactory().makeCar();
    }

    @Override
    public Car getDaZhongCar() {
        return new DaZhongFactory().makeCar();
    }
}
