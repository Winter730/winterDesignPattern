package com.winter.designPattern.builder;

/**
 * 抽象建造者类,确定产品由两个部件PartA和PartB组成,并声明一个得到产品建造后结果的方法GetResult
 */
public abstract class Builder {
    public abstract void BuildPartA();

    public abstract void BuildPartB();

    public abstract Product GetResult();
}
