package com.winter.designPattern.factoryMethod.factoryMethodDemo1;

import com.winter.designPattern.simpleFactory.Operation;

public class Main {
    public static void main(String[] args) {
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.createOperation();
        oper.set_numberA(1);
        oper.set_numberB(2);
        double result = oper.getResult();
        System.out.println(result);
    }
}
