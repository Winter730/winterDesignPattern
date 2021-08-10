package com.winter.designPattern.command.commandDemo1;

public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    public abstract void executeCommand();
}
