package com.anly.designpattern.abstractfactory;

/**
 * Created by mingjun on 2016/12/14.
 */
public class XiaoGuang {

    public static void main(String[] args) {

        CompanyFactory factory = new SbiCompanyFactory();

        // 来根据factory生产出来的东西构建一个分店:
        Company sbiCompany = new Company(factory.createStore(), factory.createCheckstand(), factory.createTableware());

        System.out.println(sbiCompany);

        // 创建Huashan工厂
        factory = new HuashanCompanyFactory();

        // 根据factory生产出来的东西构建花山店:
        Company huashanCompany = new Company(factory.createStore(), factory.createCheckstand(), factory.createTableware());

        System.out.println(huashanCompany);
    }
}
