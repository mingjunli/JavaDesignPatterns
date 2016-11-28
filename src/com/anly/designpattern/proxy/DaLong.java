package com.anly.designpattern.proxy;

/**
 * Created by mingjun on 2016/11/25.
 */
public class DaLong implements Person {

    private Person person;

    public DaLong(Person person) {
        this.person = person;
    }

    @Override
    public void signing(int price) {
        System.out.println("对方报价:" + price);

        if (price < 100) {
            this.person.signing(price);
        }
        else {
            negotiate(price);
        }
    }

    public void negotiate(int price) {
        System.out.println("不接受, 要求降价" + (price - 80));
    }
}
