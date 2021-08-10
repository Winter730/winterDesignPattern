package com.winter.designPattern.visitor;

/**
 * 具体元素,实现Accept操作
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void operationA(){

    }
}
