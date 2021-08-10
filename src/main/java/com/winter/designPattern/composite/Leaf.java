package com.winter.designPattern.composite;

/**
 * Leaf在组合中表示叶节点对象,叶节点没有子节点
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    //由于叶子没有再增加分支和树叶,所以Add和Remove方法实现它没有意义
    //但这样做可以消除叶节点和枝节点对象在抽象层次的区别
    //它们具备完全一致的接口
    @Override
    public void add(Component c) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    //显示其名称和级别
    public void display(int depth) {
        for(int i = 0; i < depth;i++){
            System.out.print("-");
        }
        System.out.println(name);
    }
}
