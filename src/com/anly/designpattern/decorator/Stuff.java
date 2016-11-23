package com.anly.designpattern.decorator;

/**
 * Created by mingjun on 2016/11/22.
 */
public abstract class Stuff implements Drink {

    private Drink originalDrink;
    public Stuff(Drink originalDrink) {
        this.originalDrink = originalDrink;
    }

    @Override
    public String make() {
        return originalDrink.make() + ", 加一份" + stuffName();
    }

    abstract String stuffName();
}
