package com.winter.designPattern.composite;

/**
 * Component为组合中的对象声明接口,在适当情况下,实现所有类共有接口的默认行为。
 * 声明一个接口用于访问和管理Component的子部件
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    //通常都使用Add和Remove方法来提供增加或移除树叶或树枝的功能
    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void display(int depth);
}
