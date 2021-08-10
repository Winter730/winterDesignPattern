package com.winter.designPattern.proxy;

/**
 * Proxy类,保存一个引用使得代理可以访问实体,并提供一个与Subject的接口相同的接口
 * 这样代理就可以用来替代实体
 */
public class Proxy extends Subject{
    private RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
