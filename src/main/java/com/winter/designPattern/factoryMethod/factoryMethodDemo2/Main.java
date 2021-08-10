package com.winter.designPattern.factoryMethod.factoryMethodDemo2;

public class Main {
    public static void main(String[] args) {
        //工厂方法模式
        IFactory factory = new VolunteerFactory();
        LeiFeng student = factory.CreateLeiFeng();

        student.BuyRice();
        student.Sweep();
        student.Wash();

        //简单工厂模式
        LeiFeng studentA = SimpleFactory.CreateLeiFeng("学雷锋的大学生");
        studentA.BuyRice();
        LeiFeng studentB = SimpleFactory.CreateLeiFeng("学雷锋的大学生");
        studentB.Sweep();
        LeiFeng studentC = SimpleFactory.CreateLeiFeng("学雷锋的大学生");
        studentC.Wash();
    }
}
