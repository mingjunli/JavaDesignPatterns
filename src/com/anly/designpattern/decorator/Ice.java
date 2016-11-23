package com.anly.designpattern.decorator;

/**
 * Created by mingjun on 2016/11/22.
 */
public class Ice extends Stuff {

    public Ice(Drink originalDrink) {
        super(originalDrink);
    }

    @Override
    String stuffName() {
        return "冰";
    }
}
