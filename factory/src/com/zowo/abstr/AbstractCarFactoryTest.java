package com.zowo.abstr;

import com.zowo.Car;

public class AbstractCarFactoryTest {

    /**
     * 对用户更加友好，用户不需要知道工厂的存在，只需关心产品就好，需要选择哪个产品自己选择
     *
     * @param args
     */
    public static void main(String[] args) {
        AbstractCarFactory factory = new CarFactory();
        Car car = factory.getAudiCar();
        System.out.println(car.getName() + "-" + car.getSpeed() + "-" + car.getColor()+"-"+factory.metra());
        car = factory.getDaZhongCar();
        System.out.println(car.getName() + "-" + car.getSpeed() + "-" + car.getColor()+"-"+factory.metra());
    }
}
