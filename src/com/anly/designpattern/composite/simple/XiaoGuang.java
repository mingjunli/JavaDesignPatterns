package com.anly.designpattern.composite.simple;

/**
 * Created by mingjun on 17/1/16.
 */
public class XiaoGuang {

    public static void main(String[] args) {

        HeadOffice headOffice = new HeadOffice("小光热干面");

        Department financeDept = new Department("财务部");
        Department strategyDept = new Department("策划部");

        BranchOffice ov = new BranchOffice("光谷分店");
        ov.add(financeDept);
        ov.add(strategyDept);

        BranchOffice huashan = new BranchOffice("花山分店");
        huashan.add(financeDept);
        huashan.add(strategyDept);

        headOffice.add(financeDept);
        headOffice.add(strategyDept);
        headOffice.add(ov);
        headOffice.add(huashan);

        headOffice.print();
    }
}
