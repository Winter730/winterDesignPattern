package com.winter.designPattern.observer;

public class Main {
    public static void main(String[] args){
        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreteObserver("X",s));
        s.attach(new ConcreteObserver("Y",s));
        s.attach(new ConcreteObserver("Z",s));

        s.SubjectState = "ABC";
        s.Notify();
    }
}
