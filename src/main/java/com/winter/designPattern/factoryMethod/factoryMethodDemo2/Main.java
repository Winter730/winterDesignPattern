package com.winter.designPattern.factoryMethod.factoryMethodDemo2;

public class Main {
    public static void main(String[] args) {
        //工厂方法模式
        IFactory factory = new VolunteerFactory();
        LeiFeng student = factory.createLeiFeng();

        student.buyRice();
        student.sweep();
        student.wash();

        //简单工厂模式
        LeiFeng studentA = SimpleFactory.createLeiFeng("学雷锋的大学生");
        studentA.buyRice();
        LeiFeng studentB = SimpleFactory.createLeiFeng("学雷锋的大学生");
        studentB.sweep();
        LeiFeng studentC = SimpleFactory.createLeiFeng("学雷锋的大学生");
        studentC.wash();
    }
}
