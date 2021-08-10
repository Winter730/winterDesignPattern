package com.winter.designPattern.composite;

public class Main {
    public static void main(String[] args){
        //生成树根root,根上长出两叶LeafA和LeafB
        Composite root = new Composite("root");
        root.Add(new Leaf("Leaf A"));
        root.Add(new Leaf("Leaf B"));

        //根上长出分枝CompositeX,分枝上也有两叶LeafXA和LeafXB
        Composite comp = new Composite("Composite X");
        comp.Add(new Leaf("Leaf XA"));
        comp.Add(new Leaf("Leaf XB"));

        root.Add(comp);

        Composite comp2 = new Composite("CompositeXY");
        comp2.Add(new Leaf("Leaf XYA"));
        comp2.Add(new Leaf("Leaf XYB"));
        comp.Add(comp2);

        //根部又长出两叶LeafC和LeafD,可惜LeafD没长牢,被风吹走了
        root.Add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        root.Add(leaf);
        root.Remove(leaf);

        root.Display(1);
    }
}
