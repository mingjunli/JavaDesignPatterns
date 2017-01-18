package com.anly.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mingjun on 17/1/15.
 */
public class Department {

    private String name;

    public Department(String name) {
        this.name = name;
    }

    private List<Department> subDepartments = new ArrayList<>();

    public void add(Department sub) {
        subDepartments.add(sub);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(name);

        for (Department dept : subDepartments) {
            builder.append("\n");
            builder.append(" - " + dept.toString());
        }

        return builder.toString();
    }
}