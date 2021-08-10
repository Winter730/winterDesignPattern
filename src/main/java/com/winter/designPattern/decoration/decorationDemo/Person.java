package com.winter.designPattern.decoration.decorationDemo;

/**
 * Person类
 * ConcreteComponent
 */
public abstract class Person {
    public Person() {
    }

    private String name;

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的" + name);
    }
}
