package com.anly.designpattern.strategy;

/**
 * Created by mingjun on 2016/11/17.
 */
public class ChristmasStrategy implements ActivityStrategy {

    @Override
    public String getActivityPrice() {
        // 经过一系列算法
        return "(圣诞节)买热干面+饮品套餐, 送大苹果一个";
    }
}
