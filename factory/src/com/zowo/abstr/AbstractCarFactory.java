package com.zowo.abstr;


import com.zowo.Car;

/**
 * 符合开闭原则 易于扩展，用户无需更改代码
 */
public abstract class AbstractCarFactory {

    //公共的逻辑
    //方便于统一管理
    public String metra(){
        return "铁";
    }

    /**
     * 获取奥迪车辆
     *
     * @return audi
     */
    public abstract Car getAudiCar();

    /**
     * 获取宝马车辆
     *
     * @return baoma
     */
    public abstract Car getBaoMaCar();

    /**
     * 获取大众车辆
     *
     * @return dazhong
     */
    public abstract Car getDaZhongCar();
}
