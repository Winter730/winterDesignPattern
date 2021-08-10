package com.winter.designPattern.chainOfResponsibility;

/**
 * ConcreteHandler类,具体处理者类,处理它所负责的请求,可访问它的后继者，
 * 如果可处理该请求,就处理之,否则就将该请求转发给它的后继者
 */
public class ConcreteHandler2 extends Handler{
    @Override
    public void HandlerRequest(int request) {
        if(request >= 10 && request < 20) {
            System.out.println(this.getClass().getName() + "处理请求" + request);
        } else if(successor != null) {
            successor.HandlerRequest(request);
        }
    }
}
