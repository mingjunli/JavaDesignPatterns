package com.anly.designpattern.templatemethod;

/**
 * Created by mingjun on 2016/12/22.
 */
public class XiaoGuang {

    public static void main(String[] args) {

        HotDryNoodlesMaker maker = new HotDryNoodlesMaker();
        maker.make();

        Maker packingMaker = new PackingMaker();
        packingMaker.make();

        Maker eatInMaker = new EatInMaker();
        eatInMaker.make();
    }
}
