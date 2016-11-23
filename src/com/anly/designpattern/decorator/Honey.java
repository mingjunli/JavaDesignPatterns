package com.anly.designpattern.decorator;

/**
 * Created by mingjun on 2016/11/22.
 */
public class Honey extends Stuff {

    public Honey(Drink originalDrink) {
        super(originalDrink);
    }

    @Override
    String stuffName() {
        return "蜂蜜";
    }
}
