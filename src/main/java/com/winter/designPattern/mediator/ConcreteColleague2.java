package com.winter.designPattern.mediator;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    //发送信息时通常是中介者发送出去的
    public void send(String message){
        mediator.send(message, this);
    }

    public void notify(String message){
        System.out.println("同事2得到信息: " + message);
    }
}
