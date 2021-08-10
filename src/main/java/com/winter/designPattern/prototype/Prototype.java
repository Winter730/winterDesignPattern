package com.winter.designPattern.prototype;

/**
 * 原型类
 */
public abstract class Prototype{
    private String id;

    public Prototype(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    //抽象类关键就是有这样一个Clone方法
    public abstract Prototype Clone();



}
