package com.winter.designPattern.builder;

/**
 * 具体建造者,实现Builder接口,构造和装配各个部件
 */
public class ConcreteBuilder1 extends Builder {
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
