package com.winter.designPattern.templateMethod.templateMethodDemo1;

public class Main {
    public static void main(String[] args){
        System.out.println("学生A的答案:");
        TestPaper studentA = new TestPaperA();
        studentA.TestQuestion1();
        studentA.TestQuestion2();
        studentA.TestQuestion3();

        System.out.println("学生B的答案:");
        TestPaper studentB = new TestPaperB();
        studentB.TestQuestion1();
        studentB.TestQuestion2();
        studentB.TestQuestion3();
    }
}
