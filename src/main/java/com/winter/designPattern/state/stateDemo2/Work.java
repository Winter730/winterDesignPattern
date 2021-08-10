package com.winter.designPattern.state.stateDemo2;

public class Work {
    private State current;

    public Work() {
        current = new ForenoonState();
    }

    private int hour;
    private boolean finish = false;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void setState(State s){
        current = s;
    }

    public void WriteProgram(){
        current.WriteProgram(this);
    }

}
