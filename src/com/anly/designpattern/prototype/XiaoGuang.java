package com.anly.designpattern.prototype;

/**
 * Created by mingjun on 2016/12/5.
 */
public class XiaoGuang {

    public static void main(String[] args) {

        // new 光谷店
        Company ovCompany = new OpticalValleyCompany();
        System.out.println("光谷店: " + ovCompany);

        // 在光谷店的基础上clone SBI店
        Company sbiCompany = ovCompany.clone();
        sbiCompany.setName("创业街分店");

        // 给SBI店新增一款饮品
        sbiCompany.addDrink("雪碧");

        System.out.println("SBI店: " + sbiCompany);
        System.out.println("光谷店: " + ovCompany);
    }
}
