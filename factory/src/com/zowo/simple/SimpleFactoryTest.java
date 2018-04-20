package com.zowo.simple;

import com.zowo.Car;

public class SimpleFactoryTest {

    /**
     * 简单工程模式类似于小作坊，你需要什么它会在能力范围内给你
     *
     * @param args
     */
    public static void main(String[] args) {

        Car car = new SimpleFactory().getCar("宝马");
        System.out.println(car.getName() + "-" + car.getSpeed() + "-" + car.getColor());
        car = new SimpleFactory().getCar("奥迪");
        System.out.println(car.getName() + "-" + car.getSpeed() + "-" + car.getColor());
    }
}
