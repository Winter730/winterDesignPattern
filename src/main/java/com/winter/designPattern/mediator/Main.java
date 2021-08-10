package com.winter.designPattern.mediator;

public class Main {
    public static void main(String[] args){
        ConcreteMediator m = new ConcreteMediator();

        //让两个具体的同事类认识中介者对象
        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);

        m.setConcreteColleague1(c1);
        m.setConcreteColleague2(c2);

        c1.send("吃过饭了没有?");
        c2.send("没有呢,你打算请客?");
    }
}
