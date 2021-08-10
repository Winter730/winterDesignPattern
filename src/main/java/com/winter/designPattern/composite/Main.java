package com.winter.designPattern.composite;

public class Main {
    public static void main(String[] args){
        //生成树根root,根上长出两叶Leafa和LeafB
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf a"));
        root.add(new Leaf("Leaf B"));

        //根上长出分枝CompositeX,分枝上也有两叶LeafXa和LeafXB
        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf Xa"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);

        Composite comp2 = new Composite("CompositeXY");
        comp2.add(new Leaf("Leaf XYa"));
        comp2.add(new Leaf("Leaf XYB"));
        comp.add(comp2);

        //根部又长出两叶LeafC和LeafD,可惜LeafD没长牢,被风吹走了
        root.add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }
}
