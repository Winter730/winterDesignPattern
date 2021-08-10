package com.winter.designPattern.composite.compositeDemo1;

/**
 * 公司类 抽象类或接口
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    //增加
    public abstract void add(Company c);

    //移除
    public abstract void remove(Company c);

    //显示
    public abstract void display(int depth);

    //履行职责
    //增加"履行职责"方法,不同的部门需要履行不同的职责
    public abstract void lineOfDuty();
}
