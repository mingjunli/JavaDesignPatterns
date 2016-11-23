package com.anly.designpattern.decorator;

/**
 * Created by mingjun on 2016/11/22.
 */
public class XDrink implements Drink {

    @Override
    public String make() {
        return "这是一杯X牌饮料";
    }
}
