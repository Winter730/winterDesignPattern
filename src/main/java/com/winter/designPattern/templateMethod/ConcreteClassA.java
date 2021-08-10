package com.winter.designPattern.templateMethod;

public class ConcreteClassA extends AbstractClass {
    @Override
    public void PrimitiveOperation1() {
        System.out.println("具体类A方法1实现");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("具体类A方法2实现");
    }
}
