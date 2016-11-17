package com.anly.designpattern.factorymethod;

/**
 * Created by mingjun on 2016/11/15.
 */
public class Cousins {

    private IBeverageMachine mBeverageMachine;

    private void setBeverageMachine(IBeverageMachine machine) {
        this.mBeverageMachine = machine;
    }

    private Drink takeDrink() {
        if (mBeverageMachine == null) throw new NullPointerException("Should set Beverage Machine firstly.");

        return mBeverageMachine.makeDrink();
    }

    public static void main(String[] args) {

        Cousins cousins = new Cousins();

        // for A
        cousins.setBeverageMachine(new OrangeJuiceMachine());
        Drink drink = cousins.takeDrink();
        System.out.println(drink);

        // for B
        cousins.setBeverageMachine(new CokeMachine());
        System.out.println(cousins.takeDrink());

        // for D
        cousins.setBeverageMachine(new MilkTeaMachine());
        System.out.println(cousins.takeDrink());
    }
}
