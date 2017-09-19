package com.struct.base.T2;

/**
 * Created by wangyonghua on 2017/9/14.
 */
public class Node {
    String name;

    //自引用
    Node next;

    public Node() {

    }

    public Node(String name) {
        this.name = name;
        this.next = null;
    }
}
