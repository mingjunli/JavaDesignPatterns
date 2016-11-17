package com.anly.designpattern.factorymethod;

/**
 * Created by mingjun on 2016/11/15.
 */
public class OrangeJuiceMachine implements IBeverageMachine {
    @Override
    public Drink makeDrink() {
        return new OrangeJuice().make();
    }
}
