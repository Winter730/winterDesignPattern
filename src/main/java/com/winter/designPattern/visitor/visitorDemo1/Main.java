package com.winter.designPattern.visitor.visitorDemo1;

public class Main {
    public static void main(String[] args){
        ObjectStructure o = new ObjectStructure();;
        o.attach(new Man());
        o.attach(new Woman());

        //成功时的反应
        Success v1 = new Success();
        o.display(v1);

        //失败时的反应
        Failing v2 = new Failing();
        o.display(v2);

        //恋爱时的反应
        Amativeness v3 = new Amativeness();
        o.display(v3);
    }
}
