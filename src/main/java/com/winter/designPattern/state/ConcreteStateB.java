package com.winter.designPattern.state;

/**
 * ConcreteState类,具体状态,每一个子类实现一个与Context的一个状态相关的行为
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        //设置ConcreteStateB的下一状态是ConcreteStateA
        context.setState(new ConcreteStateA());
    }
}
