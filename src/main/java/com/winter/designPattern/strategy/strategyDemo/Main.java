package com.winter.designPattern.strategy.strategyDemo;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //String type = "正常收费";
        String type = "满300返100";
        //String type = "打8折";
        double price = 0;
        int number = 0;

        double totalPrices;

        CashContext csuper = new CashContext(type);

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入单价");
        if (scan.hasNext()){
            price = scan.nextFloat();
        }
        System.out.println("请输入数量");
        if(scan.hasNext()){
            number = scan.nextInt();
        }

        totalPrices = csuper.getResult(price * number);
        System.out.println("单价:" + price + " 数量:" + number + " 收费策略: " + type + " 合计:" + totalPrices);

    }
}
