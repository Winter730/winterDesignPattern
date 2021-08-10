package com.winter.designPattern.flyweight;

/**
 * 继承Flyweight超类或者实现Flyweight接口,并为内部状态增加存储空间
 */
public class ConcreteFlyweight extends Flyweight{
    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体Flyweight:" + extrinsicState);
    }
}
