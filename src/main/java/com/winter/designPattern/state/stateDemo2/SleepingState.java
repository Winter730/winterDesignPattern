package com.winter.designPattern.state.stateDemo2;

public class SleepingState extends State {
    @Override
    public void WriteProgram(Work w) {
        System.out.println("当前时间:" + w.getHour() + "点 不行了,睡着了");
    }
}
