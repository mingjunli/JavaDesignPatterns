package com.anly.designpattern.composite.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mingjun on 17/1/16.
 */
public class BranchOffice {

    private String name;

    public BranchOffice(String name) {
        this.name = name;
    }

    private List<Department> departments = new ArrayList<>();

    public void add(Department sub) {
        departments.add(sub);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("分公司:" + name);

        for (Department dept : departments) {
            builder.append(" - " + dept.toString());
        }

        return builder.toString();
    }
}
