package com.winter.designPattern.visitor;

public class ConcreteElementB extends Element {
    @Override
    public void Accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void OperationB(){

    }
}
