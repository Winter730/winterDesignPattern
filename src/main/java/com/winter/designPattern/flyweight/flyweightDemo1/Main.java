package com.winter.designPattern.flyweight.flyweightDemo1;

public class Main {
    public static void main(String[] args){
        WebSiteFactory f = new WebSiteFactory();

        WebSite fx = f.getWebSiteCategory("产品展示");
        fx.use();

        WebSite fy = f.getWebSiteCategory("产品展示");
        fy.use();

        WebSite fz = f.getWebSiteCategory("产品展示");
        fz.use();

        WebSite f1 = f.getWebSiteCategory("博客");
        f1.use();


        WebSite f2 = f.getWebSiteCategory("博客");
        f2.use();

        WebSite f3 = f.getWebSiteCategory("博客");
        f3.use();

        System.out.println("网站分类总数为" + f.getWebSiteCount());

    }
}
