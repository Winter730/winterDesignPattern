package com.winter.designPattern.simpleFactory;

/**
 * 简单工厂模式
 * 简单工厂运算类
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
}
