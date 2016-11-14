package com.anly.designpattern.simplefactory;

/**
 * Created by mingjun on 2016/11/14.
 */
public class Cousins {

    public static Drink create(String drinkType) {

        //  Java7开始, switch支持String
        switch (drinkType) {
            case "橙汁":
                return new OrangeJuice();

            case "酸梅汤":
                return new PlumJuice();

            case "可乐":
                return new Coke();

            default:
                return new OrangeJuice();
        }
    }
}
