package com.example.pr_3;

import java.io.Serializable;
public class MyObject implements Serializable {
    private String fio;
    private String group_num;
    private int age;
    private int grate;
    public MyObject(String fio, String group_num, int age, int grate) {
        this.fio = fio;
        this.group_num = group_num;
        this.grate = grate;
        this.age = age;
    }
    public String getFio() {
        return fio;
    }
    public String getGroup_num() {
        return group_num;
    }
    public int getAge() {
        return age;
    }
    public int getGrate() {
        return grate;
    }
}
