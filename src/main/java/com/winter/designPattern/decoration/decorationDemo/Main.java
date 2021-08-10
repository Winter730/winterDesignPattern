package com.winter.designPattern.decoration.decorationDemo;

public class Main {
    public static void main(String[] args){
        Person xc = new Person("小菜");

        System.out.println("第一种装扮");

        Sneakers pqx = new Sneakers();
        BigTrouser kk = new BigTrouser();
        TShirts dtx = new TShirts();

        pqx.decorate(xc);
        kk.decorate(pqx);
        dtx.decorate(kk);
        dtx.show();

        System.out.println("第二种装扮");

        LeatherShoes px = new LeatherShoes();
        Tie ld = new Tie();
        Suit xz = new Suit();

        px.decorate(xc);
        ld.decorate(px);
        xz.decorate(ld);
        xz.show();
    }
}
