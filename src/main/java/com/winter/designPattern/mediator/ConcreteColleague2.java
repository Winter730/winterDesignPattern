package com.winter.designPattern.mediator;

/**
 * 具体同事类,每个具体同事只知道自己的行为,而不了解其他同事类的情况,但它们都认识中介者对象
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    //发送信息时通常是中介者发送出去的
    public void send(String message){
        mediator.send(message, this);
    }

    public void Notify(String message){
        System.out.println("同事2得到信息: " + message);
    }
}
