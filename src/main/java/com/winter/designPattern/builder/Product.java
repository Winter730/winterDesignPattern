package com.winter.designPattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类,由多个部件组成
 */
public class Product {
    List<String> parts = new ArrayList<>();

    //添加产品部件
    public void Add(String part){
        parts.add(part);
    }

    public void Show(){
        System.out.println("产品 创建------");
        for(String part: parts){
            System.out.println(part);
        }
    }
}