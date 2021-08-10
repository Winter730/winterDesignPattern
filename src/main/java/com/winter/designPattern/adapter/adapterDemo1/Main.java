package com.winter.designPattern.adapter.adapterDemo1;

public class Main {
    public static void main(String[] args){
        Player b = new Forwards("b");
        b.Attack();

        Player m = new Guards("m");
        m.Attack();

        Player ym = new Translator("ym");
        ym.Attack();
        ym.Defense();
    }
}
