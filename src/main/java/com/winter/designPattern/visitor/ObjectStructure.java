package com.winter.designPattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * ObjectStructure类,能枚举它的元素,可以提供一个高层的接口以允许访问者访问它的元素.
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void attach(Element element){
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for(Element e: elements) {
            e.accept(visitor);
        }
    }
}
