package com.winter.designPattern.templateMethod.templateMethodDemo1;

public abstract class TestPaper {
    public void testQuestion1(){
        System.out.println("TestQuestion1" + "answer = " + answer1());
    }

    protected abstract String answer1();

    public void testQuestion2(){
        System.out.println("TestQuestion2" + "answer = " + answer2());
    }

    protected abstract String answer2();

    public void testQuestion3(){
        System.out.println("TestQuestion3" + "answer = " + answer3());
    }

    protected abstract String answer3();
}
