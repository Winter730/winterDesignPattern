package com.winter.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite定义有枝节点行为,用来存储子部件,在Component接口中实现与子部件有关的操作
 * 比如增加Add和删除Remove
 */
public class Composite extends Component{
    //一个子对象集合用来存储其下属的枝节点和叶节点
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }


    @Override
    public void Add(Component c) {
        children.add(c);
    }

    @Override
    public void Remove(Component c) {
        children.remove(c);
    }

    @Override
    public void Display(int depth) {
        for(int i = 0; i < depth;i++){
            System.out.print("-");
        }
        System.out.println(name);

        for(Component component : children){
            component.Display(depth + 2);
        }
    }
}
