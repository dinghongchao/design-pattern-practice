package com.zowo;

/**
 * 大众
 *
 * @author DHC
 */
public class DaZhong implements Car {
    @Override
    public String getName() {
        return "大众";
    }

    @Override
    public long getSpeed() {
        return 80;
    }

    @Override
    public String getColor() {
        return "灰色";
    }
}
