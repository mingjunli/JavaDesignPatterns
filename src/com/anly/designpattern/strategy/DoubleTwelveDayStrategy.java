package com.anly.designpattern.strategy;

/**
 * Created by mingjun on 2016/11/17.
 */
public class DoubleTwelveDayStrategy implements ActivityStrategy {

    @Override
    public String getActivityPrice() {
        // 经过一系列算法
        return "(双十二)满12立减2元";
    }
}
