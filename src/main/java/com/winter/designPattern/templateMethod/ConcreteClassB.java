package com.winter.designPattern.templateMethod;

public class ConcreteClassB extends AbstractClass {
    @Override
    public void PrimitiveOperation1() {
        System.out.println("具体类B方法1实现");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("具体类方法2实现");
    }
}
