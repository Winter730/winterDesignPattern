package com.winter.designPattern.proxy;

/**
 * 定义Proxy所代表的真实实体
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}


