package com.anly.designpattern.templatemethod;

/**
 * Created by mingjun on 2016/12/22.
 */
public abstract class Maker {

    public void make() {
        // 1, 烫面
        tangmian();

        // 2, 装碗
        zhuangwan();

        // 3, 加调料(盐，鸡精，胡椒粉之类)
        jiatiaoliao();

        // 4, 加芝麻酱
        jiazhimajiang();
    }

    private void tangmian() {
        System.out.println("热干面入沸水锅焯烫十几秒");
    }

    private void jiatiaoliao() {
        System.out.println("加调料");
    }

    private void jiazhimajiang() {
        System.out.println("加芝麻酱");
    }

    // 将装碗这一步抽象出来, 由具体的子类实现
    abstract void zhuangwan();
}
