package com.winter.designPattern.flyweight;

import java.util.Hashtable;

/**
 * 一个享元工厂,用来创建并管理Flyweight对象.它主要是用来确保合理地共享Flyweight.
 * 当用户请求一个Flyweight时,FlyweightFactory对象提供一个已创建的实例或者创建一个(如果不存在的话)
 */
public class FlyweightFactory {
    private Hashtable<String, Flyweight> flyweights = new Hashtable();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    //根据客户端请求，获得已生成的实例
    public Flyweight getFlyweight(String key){
        return flyweights.get(key);
    }

}
