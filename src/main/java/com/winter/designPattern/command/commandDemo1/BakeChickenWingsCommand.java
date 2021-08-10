package com.winter.designPattern.command.commandDemo1;

public class BakeChickenWingsCommand extends Command{
    public BakeChickenWingsCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeChickenWing();
    }
}
