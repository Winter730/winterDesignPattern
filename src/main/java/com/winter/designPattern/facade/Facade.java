package com.winter.designPattern.facade;

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

    public void MethodA(){
        System.out.println("方法组A() ----- ");
        one.MethodOne();
        two.MethodTwo();
        four.MethodFour();
    }

    public void MethodB(){
        System.out.println("方法组B() ----- ");
        two.MethodTwo();
        three.MethodThree();
    }
}
