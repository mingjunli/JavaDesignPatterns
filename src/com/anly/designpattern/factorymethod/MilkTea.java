package com.anly.designpattern.factorymethod;

/**
 * Created by mingjun on 2016/11/15.
 */
public class MilkTea extends Drink {
    @Override
    String getInstantPackage() {
        return "速溶奶茶粉";
    }

    @Override
    String getName() {
        return "奶茶";
    }
}
