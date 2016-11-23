package com.anly.designpattern.decorator;

/**
 * Created by mingjun on 16/11/10.
 */
public class XiaoGuang {

    public static void main(String[] args) {

        Drink coke = new Coke();
        System.out.println(coke.make());

        // 老板, 来一杯可乐, 加冰
        Drink iceCoke = new Ice(new Coke());
        System.out.println(iceCoke.make());

        // 老板, X饮料, 加冰, 加糖
        Drink iceSugarXDrink = new Ice(new Sugar(new XDrink()));
        System.out.println(iceSugarXDrink.make());

        // 可乐, 加两份冰, 加蜂蜜
        Drink doubleIceHoneyCoke = new Ice(new Ice(new Honey(new Coke())));
        System.out.println(doubleIceHoneyCoke.make());

        // 加蜂蜜的X饮料
        Drink honeyXDrink = new Honey(new XDrink());
        System.out.println(honeyXDrink.make());

        // 还要加冰
        Drink iceHoneyXDrink = new Ice(honeyXDrink);
        System.out.println(iceHoneyXDrink.make());

    }
}
