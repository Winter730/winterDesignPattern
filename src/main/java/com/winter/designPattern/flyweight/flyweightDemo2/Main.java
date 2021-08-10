package com.winter.designPattern.flyweight.flyweightDemo2;

public class Main {
    public static void main(String[] args) {
        WebSiteFactory f = new WebSiteFactory();

        WebSite fx = f.getWebSiteCategory("产品展示");
        fx.use(new User("小菜"));

        WebSite fy = f.getWebSiteCategory("产品展示");
        fy.use(new User("大鸟"));

        WebSite fz = f.getWebSiteCategory("产品展示");
        fz.use(new User("娇娇"));

        WebSite f1 = f.getWebSiteCategory("博客");
        f1.use(new User("winter"));


        WebSite f2 = f.getWebSiteCategory("博客");
        f2.use(new User("summer"));

        WebSite f3 = f.getWebSiteCategory("博客");
        f3.use(new User("spring"));

        System.out.println("网站分类总数为" + f.getWebSiteCount());
    }
}
