package com.winter.designPattern.command;

/**
 * Invoker类,要求该命令执行这个请求
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void ExecuteCommand(){
        command.Execute();
    }
}
