package com.winter.designPattern.strategy.simpleFactoryDemo;

/**
 * 现金收费工厂类
 *
 * 简单工厂这个模式只是解决对象的创建问题,由于工厂本身包括了所有的收费方式,商场是可能经常性地更改打折额度和返利额度,
 * 每次维护或扩展收费方法都要改动这个工厂,以致代码需要重新部署,这真的是很糟糕的处理方式,所以用它不是最好的办法。
 *
 */
public class CashFactory {
    public static CashSuper createCashAccept(String type){
        CashSuper cs = null;
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
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
        return cs;
    }
}
