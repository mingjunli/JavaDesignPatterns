package com.anly.designpattern.singleton;

import java.util.ArrayList;

/**
 * Created by mingjun on 2016/12/16.
 */
public class Form {

    protected ArrayList<String> mFormData = new ArrayList<>();

    public void write(String data) {
        mFormData.add(data);
    }

    @Override
    public String toString() {
        return "表格:" + this.hashCode() + ", 数据:" + mFormData;
    }
}
