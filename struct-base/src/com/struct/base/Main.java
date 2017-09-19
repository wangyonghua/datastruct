package com.struct.base;

import com.struct.base.T1.Link;
import com.struct.base.T2.MyArrayStatck;
import com.struct.base.T2.MyStack;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Link link = new Link();
//        link.add("组长");
//        link.add("经理");
//        link.add("副总");
//        link.add("总经理");
//        link.display();
//        link.delNode("经理");
//        link.display();
//        link.insert("组长", "经理");
//        link.display();
//        System.out.println(link.size());
        MyArrayStatck myStack = new MyArrayStatck();
        myStack.push("组长");
        myStack.push("项目经理");
        myStack.push("副总 ");
        myStack.push("总经理");
        myStack.push("总经理1");
        myStack.push("总经理2");

        System.out.println(myStack.size());

        while (!myStack.empty()) {
            System.out.println(myStack.pop());
            System.out.println(myStack.size());
        }

        System.out.println(myStack.size());
    }
}
