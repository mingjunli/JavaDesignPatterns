package com.anly.designpattern.composite.simple;

/**
 * Created by mingjun on 17/1/16.
 */
public class Department {

    private String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "部门:" + name;
    }
}
