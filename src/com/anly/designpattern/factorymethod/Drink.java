package com.anly.designpattern.factorymethod;

/**
 * Created by mingjun on 2016/11/14.
 */
public abstract class Drink {

    private String name;
    private String instantPackage;

    public Drink make() {
        this.name = getName();
        this.instantPackage = getInstantPackage();
        return this;
    }

    abstract String getInstantPackage();
    abstract String getName();

    @Override
    public String toString() {
        return "This is a cup of:" + this.name;
    }
}
