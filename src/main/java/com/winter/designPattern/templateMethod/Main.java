package com.winter.designPattern.templateMethod;

public class Main {
    public static void main(String[] args){
        AbstractClass c;
        c = new ConcreteClassA();
        c.templateMethod();

        c = new ConcreteClassB();
        c.templateMethod();


    }
}
