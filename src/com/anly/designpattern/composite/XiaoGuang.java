package com.anly.designpattern.composite;


/**
 * Created by mingjun on 17/1/17.
 */
public class XiaoGuang {

    public static void main(String[] args) {

        Department financeDept = new Department("财务部");
        Department strategyDept = new Department("策划部");

        Department ovBranchOffice = new Department("光谷分店");
        ovBranchOffice.add(financeDept);
        ovBranchOffice.add(strategyDept);

        Department huashanBranchOffice = new Department("花山分店");
        huashanBranchOffice.add(financeDept);
        huashanBranchOffice.add(strategyDept);

        Department wuhanChildOffice = new Department("武汉子公司");
        wuhanChildOffice.add(ovBranchOffice);
        wuhanChildOffice.add(huashanBranchOffice);

        Department changshaChildOffice = new Department("长沙子公司");

        Department xiaoguang = new Department("小光热干面");
        xiaoguang.add(wuhanChildOffice);
        xiaoguang.add(changshaChildOffice);
        xiaoguang.add(financeDept);
        xiaoguang.add(strategyDept);

        System.out.println(xiaoguang);
    }
}
