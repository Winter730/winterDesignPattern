package com.winter.designPattern.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();

        if(s1 == s2) {
            System.out.println("两个对象是相同的实例");
        }
    }
}
