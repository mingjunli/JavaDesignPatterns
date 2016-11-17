package com.anly.designpattern.factorymethod;

/**
 * Created by mingjun on 2016/11/15.
 */
public class MilkTeaMachine implements IBeverageMachine {
    @Override
    public Drink makeDrink() {
        return new MilkTea().make();
    }
}
