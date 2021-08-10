package com.winter.designPattern.state.stateDemo2;



public class ForenoonState extends State {
    @Override
    public void WriteProgram(Work w) {
        if(w.getHour() < 12) {
            System.out.println("当前时间:" + w.getHour() + "点 上午工作,精神百倍");
        } else {
            w.setState(new AfternoonState());
            w.WriteProgram();
        }
    }
}
