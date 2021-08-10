package com.winter.designPattern.flyweight.flyweightDemo1;



import java.util.Hashtable;

/**
 * 网站工厂
 */
public class WebSiteFactory {
    private Hashtable<String, WebSite> flyweights = new Hashtable();

    //获得网站分类
    public WebSite getWebSiteCategoty(String key){
        if(!flyweights.containsKey(key))
            flyweights.put(key, new ConcreteWebSite(key));
        return flyweights.get(key);
    }

    //获得网站分类总数
    public int getWebSiteCount(){
        return  flyweights.size();
    }
}
