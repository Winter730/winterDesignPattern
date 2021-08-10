package com.winter.designPattern.flyweight.flyweightDemo2;

import java.util.Hashtable;

public class WebSiteFactory {
    private Hashtable<String, WebSite> flyweights = new Hashtable();

    //获得网站分类
    public WebSite getWebSiteCategory(String key){
        if(!flyweights.containsKey(key))
            flyweights.put(key, new ConcreteWebSite(key));
        return flyweights.get(key);
    }

    //获得网站分类总数
    public int getWebSiteCount(){
        return  flyweights.size();
    }
}
