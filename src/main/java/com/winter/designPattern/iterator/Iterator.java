package com.winter.designPattern.iterator;

/**
 * Iterator 迭代器抽象类
 * 用于定义得到开始对象,得到下一个对象、判断是否到结尾、当前对象等抽象方法,统一接口
 */
public abstract class Iterator {

    public abstract Object First();

    public abstract Object Next();

    public abstract boolean IsDone();

    public abstract Object CurrentItem();
}
