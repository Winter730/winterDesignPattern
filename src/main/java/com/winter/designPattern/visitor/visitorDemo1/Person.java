package com.winter.designPattern.visitor.visitorDemo1;

/**
 * "人"的抽象类
 */
public abstract class Person {
    //接受
    public abstract void accept(Action visitor);
}
