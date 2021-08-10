package com.winter.designPattern.templateMethod.templateMethodDemo1;

public class Main {
    public static void main(String[] args){
        System.out.println("学生A的答案:");
        TestPaper studentA = new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println("学生B的答案:");
        TestPaper studentB = new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }
}
