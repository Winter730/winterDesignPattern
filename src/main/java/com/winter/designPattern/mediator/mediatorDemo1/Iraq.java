package com.winter.designPattern.mediator.mediatorDemo1;

public class Iraq extends Country {
    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    //声明
    public void declare(String message){
        mediator.declare(message, this);
    }

    //获得消息
    public void getMessage(String message){
        System.out.println("伊拉克获得对方消息:" + message);
    }
}
