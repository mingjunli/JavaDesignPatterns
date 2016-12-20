package com.anly.designpattern.singleton;

/**
 * Created by mingjun on 2016/12/16.
 */
public class Demo {

    public static void main(String[] args) {

        Cousins cousins = new Cousins();
        Form form = cousins.submitReport();
        System.out.println(form);

        XiaoZhang xiaoZhang = new XiaoZhang();
        Form form2 = xiaoZhang.submitReport();
        System.out.println(form2);
    }
}
