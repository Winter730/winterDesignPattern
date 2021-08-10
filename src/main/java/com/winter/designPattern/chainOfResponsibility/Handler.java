package com.winter.designPattern.chainOfResponsibility;

/**
 * Handler类,定义一个处理请求的接口
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    //处理请求的抽象方法
    public abstract void handlerRequest(int request);
}
