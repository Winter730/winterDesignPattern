package com.winter.designPattern.factoryMethod.factoryMethodDemo1;

import com.winter.algorithm.designPattern.simpleFactory.Operation;

public class Main {
    public static void main(String[] args) {
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.CreateOperation();
        oper.set_numberA(1);
        oper.set_numberB(2);
        double result = oper.GetResult();
        System.out.println(result);
    }
}
