package com.winter.designPattern.bridge.bridgeDemo1;

public class Main {
    public static void main(String[] args) {
        HandsetBrand ab;
        ab = new HandsetBrandN();

        ab.setSoft(new HandsetGame());
        ab.run();

        ab.setSoft(new HandsetAddressList());
        ab.run();

        ab = new HandsetBrandM();

        ab.setSoft(new HandsetGame());
        ab.run();

        ab.setSoft(new HandsetAddressList());
        ab.run();


    }
}
