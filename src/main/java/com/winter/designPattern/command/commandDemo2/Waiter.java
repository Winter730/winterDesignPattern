package com.winter.designPattern.command.commandDemo2;

import com.winter.algorithm.designPattern.command.commandDemo1.Command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {
    private List<Command> orders = new ArrayList<>();

    //设置订单
    public void setOrder(Command command){
        if(command.getClass().getName().equals("com.winter.algorithm.designPattern.command.commandDemo1.BakeChinkenWingsCommand")) {
            System.out.println("服务员: 鸡翅没有了,请点别的烧烤.");
        } else {
            orders.add(command);
            System.out.println("增加订单:" + command.getClass().getName() + " 时间:" + new Date());
        }
    }

    //取消订单
    public void CancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单:" + command.getClass().getName() + " 时间:" + new Date());
    }

    //通知执行
    public void Notify(){
        for(Command cmd : orders) {
            cmd.ExecuteCommand();
        }

    }
}
