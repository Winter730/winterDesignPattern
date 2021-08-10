package com.winter.designPattern.builder;

/**
 * Builder是为创建一个Product对象的各个部件指定的抽象接口
 * 抽象建造者类,确定产品由两个部件PartA和PartB组成,并声明一个得到产品建造后结果的方法GetResult
 */
public abstract class Builder {
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();
}
