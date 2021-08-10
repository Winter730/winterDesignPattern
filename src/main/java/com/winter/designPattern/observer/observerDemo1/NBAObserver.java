package com.winter.designPattern.observer.observerDemo1;

public class NBAObserver {
    private String name;
    private Subject sub;

    public NBAObserver(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    //关闭NBA直播
    public void CloseNBADirectSeeding(){
        System.out.println(sub.getSubjetState() + " " + name + "关闭NBA直播,继续工作!");
    }
}
