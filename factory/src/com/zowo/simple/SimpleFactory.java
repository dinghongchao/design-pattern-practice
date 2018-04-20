package com.zowo.simple;

import com.zowo.Audi;
import com.zowo.BaoMa;
import com.zowo.Car;
import com.zowo.DaZhong;

/**
 * 简单工程模式
 * 不符合开闭原则
 *
 * @author DHC
 */
public class SimpleFactory {

    public Car getCar(String name) {
        if ("宝马".equals(name)) {
            return new BaoMa();
        } else if ("奥迪".equals(name)) {
            return new Audi();
        } else if ("大众".equals(name)) {
            return new DaZhong();
        } else {
            System.out.println("不能生产此车辆");
            return null;
        }
    }
}
