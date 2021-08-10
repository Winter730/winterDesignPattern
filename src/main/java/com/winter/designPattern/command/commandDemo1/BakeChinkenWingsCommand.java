package com.winter.designPattern.command.commandDemo1;

public class BakeChinkenWingsCommand extends Command{
    public BakeChinkenWingsCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void ExecuteCommand() {
        receiver.BakeChickenWing();
    }
}
