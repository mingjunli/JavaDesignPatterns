package com.anly.designpattern.composite.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mingjun on 17/1/16.
 */
// 总公司
public class HeadOffice {

    private String name;

    public HeadOffice(String name) {
        this.name = name;
    }

    private List<Department> departments = new ArrayList<>();

    public void add(Department sub) {
        departments.add(sub);
    }

    private List<BranchOffice> branches = new ArrayList<>();

    public void add(BranchOffice branchOffice) {
        branches.add(branchOffice);
    }

    public void print() {
        System.out.println("总公司:" + name);
        for (BranchOffice branch : branches) {
            System.out.println(" - " + branch);
        }

        for (Department dept : departments) {
            System.out.println(" - " + dept);
        }
    }
}
