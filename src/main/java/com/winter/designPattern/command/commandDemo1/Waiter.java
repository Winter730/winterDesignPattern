package com.winter.designPattern.command.commandDemo1;

public class Waiter {
    private Command command;

    //设置订单
    //服务员类,不用管用户想要什么烤肉,反正都是命令
    //只管记录订单,然后通知"烤肉串者"执行即可
    public void setOrder(Command command){
        this.command = command;
    }

    //通知执行
    public void Notify(){
        command.executeCommand();
    }
}
