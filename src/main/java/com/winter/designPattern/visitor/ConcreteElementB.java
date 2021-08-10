package com.winter.designPattern.visitor;

/**
 * 具体元素,实现Accept操作
 */
public class ConcreteElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationB(){

    }
}
