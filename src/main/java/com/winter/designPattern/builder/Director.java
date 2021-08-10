package com.winter.designPattern.builder;

/**
 * 指挥者类,是构建一个使用Builder接口的对象
 */
public class Director {
    public void Construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }

}
