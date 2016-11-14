package com.anly.designpattern.simplefactory;

/**
 * Created by mingjun on 2016/11/14.
 */
public abstract class Drink {

    public void make() {
        // 1. 拿出一次性饮料杯
        System.out.println("拿出一次性饮料杯");

        // 2. 加入速溶橙汁粉
        System.out.println("加入" + getInstantPackage());

        // 3. 加水冲兑
        System.out.println("加水");

        // 4. 加盖, 打包
        System.out.println("加盖, 打包");
    }

    abstract String getInstantPackage();
}
