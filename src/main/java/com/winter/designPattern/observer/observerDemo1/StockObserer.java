package com.winter.designPattern.observer.observerDemo1;


/**
 * 看股票的同事
 */
public class StockObserer {
    private String name;
    private Subject sub;

    public StockObserer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    //关闭股票行情
    public void CloseStockMarket(){
        System.out.println(sub.getSubjetState() + " " + name + "关闭股票行情,继续工作!");
    }

}
