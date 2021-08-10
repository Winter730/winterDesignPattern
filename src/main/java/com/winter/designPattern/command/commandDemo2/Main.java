package com.winter.designPattern.command.commandDemo2;


import com.winter.designPattern.command.commandDemo1.BakeChickenWingsCommand;
import com.winter.designPattern.command.commandDemo1.BakeMuttonCommand;
import com.winter.designPattern.command.commandDemo1.Barbecuer;
import com.winter.designPattern.command.commandDemo1.Command;

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
        girl.setOrder(bakeMuttonCommand2);
        girl.setOrder(bakeChickenWingCommand1);
        girl.Notify();
    }


}
