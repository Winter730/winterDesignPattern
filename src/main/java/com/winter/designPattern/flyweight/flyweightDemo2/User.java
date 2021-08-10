package com.winter.designPattern.flyweight.flyweightDemo2;

/**
 * 用户类,用于网站的客户账号,是"网站"类的外部状态
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }
}
