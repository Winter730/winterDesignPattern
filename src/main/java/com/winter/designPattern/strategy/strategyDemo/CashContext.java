package com.winter.designPattern.strategy.strategyDemo;

public class CashContext {
    //声明一个CashSuper对象
    private CashSuper cs;

    //通过构造方法,传入具体的收费策略
    /*public CashContext(CashSuper cs) {
        this.cs = cs;
    }*/
    //策略与简单工厂结合
    //注意参数不是具体的收费策略对象,而是一个字符串,表示收费类型
    public CashContext(String type) {
        //将实例化具体策略的过程由客户端转移到Context类中,简单工厂的应用
        switch (type) {
            case "正常收费":
                CashNormal cs0 = new CashNormal();
                cs = cs0;
                break;
            case "满300返100":
                CashReturn cr1 = new CashReturn("300", "100");
                cs = cr1;
                break;
            case "打8折":
                CashRebate cr2 = new CashRebate("0.8");
                cs = cr2;
                break;
        }
    }

    //根据收费策略的不同,获得计算结果
    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
