package com.winter.designPattern.flyweight;

/**
 * UnsharedConcreteFlyweight是指那些不需要共享的Flyweight子类
 * 因为Flyweight接口共享称为可能,但它并不强制共享
 */
public class UnsharedConcreteFlyweight extends Flyweight{
    @Override
    public void Operation(int extrinsicState) {
        System.out.println("不共享的具体Flyweight:" + extrinsicState);
    }
}
