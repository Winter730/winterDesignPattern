package com.winter.designPattern.state.stateDemo2;

public class EveningState extends State {
    @Override
    public void WriteProgram(Work w) {
        if(w.isFinish()){
            w.setState(new RestState());
            w.WriteProgram();
        } else {
            if(w.getHour() < 21) {
                System.out.println("当前时间:" + w.getHour() + "点 加班");
            } else {
                w.setState(new SleepingState());
                w.WriteProgram();
            }
        }
    }
}
