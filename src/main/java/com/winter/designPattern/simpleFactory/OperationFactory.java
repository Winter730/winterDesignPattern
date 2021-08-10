package com.winter.designPattern.simpleFactory;

/**
 * 简单工厂模式
 */
public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }

    public static void main(String[] args){
        Operation oper = OperationFactory.createOperate("+");
        oper.set_numberA(1);
        oper.set_numberB(2);
        double result = oper.GetResult();
        System.out.println(result);
    }
}
