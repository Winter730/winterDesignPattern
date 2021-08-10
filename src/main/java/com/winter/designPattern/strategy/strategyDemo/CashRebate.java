package com.winter.designPattern.strategy.strategyDemo;

/**
 * 打折收费子类
 */
public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;

    //打折收费,初始化时,必须要输入折扣率,如八折,就是0.8
    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
