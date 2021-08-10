package com.winter.designPattern.simpleFactory;

public class Main {
    public static void main(String[] args){
        Operation oper = OperationFactory.createOperate("+");
        oper.set_numberA(1);
        oper.set_numberB(2);
        double result = oper.getResult();
        System.out.println(result);
    }
}
