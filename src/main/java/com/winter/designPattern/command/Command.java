package com.winter.designPattern.command;

/**
 * Command类,用来声明执行操作的接口
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();

}
