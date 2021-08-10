package com.winter.designPattern.iterator;

/**
 * Aggregate聚集抽象类
 */
public abstract class Aggregate {
    //创建迭代器
    public abstract Iterator CreateIterator();
}
