package com.anly.designpattern.decorator;

/**
 * Created by mingjun on 2016/11/22.
 */
public class Sugar extends Stuff {

    public Sugar(Drink originalDrink) {
        super(originalDrink);
    }

    @Override
    String stuffName() {
        return "糖";
    }
}
