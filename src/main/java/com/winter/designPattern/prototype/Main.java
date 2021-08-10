package com.winter.designPattern.prototype;

public class Main {
    public static void main(String[] args){
        ConcretePrototype1 p1 = new ConcretePrototype1("I");
        ConcretePrototype1 c1 = (ConcretePrototype1) p1.Clone();
        System.out.println("Cloned:" + c1.getId());
    }
}
