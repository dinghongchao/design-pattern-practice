package com.zowo;

/**
 * 奥迪
 *
 * @author DHC
 */
public class Audi implements Car {
    @Override
    public String getName() {
        return "奥迪";
    }

    @Override
    public long getSpeed() {
        return 90;
    }

    @Override
    public String getColor() {
        return "黑色";
    }


}
