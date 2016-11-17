package com.anly.designpattern.factorymethod;

/**
 * Created by mingjun on 2016/11/15.
 */
public class Coke extends Drink {
    @Override
    String getInstantPackage() {
        return "速溶可乐粉";
    }

    @Override
    String getName() {
        return "可乐";
    }
}
