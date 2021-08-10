package com.winter.designPattern.adapter.adapterDemo1;

public class Main {
    public static void main(String[] args){
        Player b = new Forwards("b");
        b.attack();

        Player m = new Guards("m");
        m.attack();

        Player ym = new Translator("ym");
        ym.attack();
        ym.defense();
    }
}
