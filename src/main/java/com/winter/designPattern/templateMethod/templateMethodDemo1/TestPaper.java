package com.winter.designPattern.templateMethod.templateMethodDemo1;

public abstract class TestPaper {
    public void TestQuestion1(){
        System.out.println("TestQuestion1" + "answer = " + Answer1());
    }

    protected abstract String Answer1();

    public void TestQuestion2(){
        System.out.println("TestQuestion2" + "answer = " + Answer2());
    }

    protected abstract String Answer2();

    public void TestQuestion3(){
        System.out.println("TestQuestion3" + "answer = " + Answer3());
    }

    protected abstract String Answer3();
}
