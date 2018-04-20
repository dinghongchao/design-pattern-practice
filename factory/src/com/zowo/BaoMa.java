package com.zowo;

/**
 * 宝马
 *
 * @author DHC
 */
public class BaoMa implements Car {
    @Override
    public String getName() {
        return "宝马";
    }

    @Override
    public long getSpeed() {
        return 100;
    }

    @Override
    public String getColor() {
        return "白色";
    }
}
