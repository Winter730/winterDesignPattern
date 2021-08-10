package com.winter.designPattern.flyweight;

import java.util.Hashtable;

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
