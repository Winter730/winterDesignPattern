package com.winter.designPattern.command.commandDemo1;

public class Main {
    public static void main(String[] args) {
        //开店前的准备
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand1 = new BakeChickenWingsCommand(boy);

        Waiter girl = new Waiter();

        //开门营业
        girl.setOrder(bakeMuttonCommand1);
        girl.Notify();
        girl.setOrder(bakeMuttonCommand2);
        girl.Notify();
        girl.setOrder(bakeChickenWingCommand1);
        girl.Notify();
    }


}
