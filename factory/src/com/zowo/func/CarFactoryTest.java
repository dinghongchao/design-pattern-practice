package com.zowo.func;

import com.zowo.Car;

public class CarFactoryTest {

    /**
     * 方法工厂虽然统一了，但对用户并不友好，用户还需关注对应的工厂
     *
     * @param args
     */
    public static void main(String[] args) {
        CarFactory factory = new AudiFactory();
        Car car = factory.makeCar();
        System.out.println(car.getName() + "-" + car.getSpeed() + "-" + car.getColor());
        factory = new BaoMaFactory();
        car = factory.makeCar();
        System.out.println(car.getName() + "-" + car.getSpeed() + "-" + car.getColor());
    }
}
