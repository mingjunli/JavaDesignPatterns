package com.anly.designpattern.prototype;

import java.util.ArrayList;

/**
 * Created by mingjun on 2016/12/5.
 */
public class Company implements Cloneable {

    // 此处我们假装省略了N多, 诸如活动策略, 饮料机, 热干面生产流程等.
    // 再此仅以饮品为例
    private ArrayList<String> drinks = new ArrayList<>();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDrink(String drink) {
        drinks.add(drink);
    }

    @Override
    protected Company clone() {

        Company company = null;
        try {
            company = (Company) super.clone();

            // 对于对象的属性也加以clone
            company.drinks = (ArrayList<String>) this.drinks.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return company;
    }

    @Override
    public String toString() {
        return "{" +
                "名字: '" + getName() + '\'' +
                ", 饮品: " + drinks  + '\'' +
                '}';
    }
}
