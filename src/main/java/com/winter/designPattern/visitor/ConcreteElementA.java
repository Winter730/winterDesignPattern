package com.winter.designPattern.visitor;

public class ConcreteElementA extends Element {
    @Override
    public void Accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void OperationA(){

    }
}
