package com.winter.designPattern.visitor.visitorDemo1;

/**
 * "状态"的抽象类
 */
public abstract class Action {
    //得到男人结论或反应
    public abstract void getManConclusion(Man concreteElementA);

    //得到女人结论或反应
    public abstract void getWomanConclusion(Woman concreteElementB);
}
