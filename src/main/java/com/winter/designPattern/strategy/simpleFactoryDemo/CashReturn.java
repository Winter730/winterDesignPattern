package com.winter.designPattern.strategy.simpleFactoryDemo;

/**
 * 返利收费子类
 */
public class CashReturn extends CashSuper{
    private double moneyCondition;

    private double moneyReturn;

    /**
     * 返利收费,初始化时必须要输入返利条件和返利值
     * @param moneyCondition 返利条件
     * @param moneyReturn 返利值
     */
    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }


    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
