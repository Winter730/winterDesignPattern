package com.winter.designPattern.mediator;

/**
 * 具体中介者类,实现抽象类的方法
 * 它需要知道所有具体同事类,并从具体同事接收消息,向具体同事对象发出命令
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 concreteColleague1;

    private ConcreteColleague2 concreteColleague2;

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague.getClass().getName().equals(concreteColleague1.getClass().getName())){
            concreteColleague2.Notify(message);
        } else {
            concreteColleague1.Notify(message);
        }
    }
}
