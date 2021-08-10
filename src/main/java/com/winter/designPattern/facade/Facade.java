package com.winter.designPattern.facade;

/**
 * Facade 外观类
 * 知道哪些子系统类负责处理请求
 * 将客户的请求代理给适当的子系统对象
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSysteThree three;
    SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSysteThree();
        four = new SubSystemFour();
    }

    public void methodA(){
        System.out.println("方法组A() ----- ");
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB(){
        System.out.println("方法组B() ----- ");
        two.methodTwo();
        three.methodThree();
    }
}
