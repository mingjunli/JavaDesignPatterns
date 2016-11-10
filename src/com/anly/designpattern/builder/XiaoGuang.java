package com.anly.designpattern.builder;

/**
 * Created by mingjun on 16/11/10.
 */
public class XiaoGuang {

    public static void main(String[] args) {

        // A
        HotDryNoodles noodlesA = new HotDryNoodles(true, true, false, true);
        System.out.println("Customer A wants: " + noodlesA);

        // B
        HotDryNoodles noodlesB = new HotDryNoodles(true, false, false, true);
        System.out.println("Customer B wants: " + noodlesB);

        // with builder
        HotDryNoodlesWithBuilder noodlesC = new HotDryNoodlesWithBuilder.Builder()
                .withChili()
                .withParsley()
                .build();
        System.out.println("Customer C wants: " + noodlesC);

        HotDryNoodlesWithBuilder noodlesD = new HotDryNoodlesWithBuilder.Builder()
                .withChili()
                .withParsley()
                .withSauerkraut()
                .withShallot()
                .build();
        System.out.println("Customer D wants: " + noodlesD);
    }
}
