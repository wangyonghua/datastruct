package com.struct.base.T1;

/**
 * Created by wangyonghua on 2017/9/14.
 */
public class DNode {
    String name;

    //后续
    DNode next;

    //前驱
    DNode prior;

    public DNode() {

    }

    public DNode(String name) {
        this.name = name;
        this.next = null;
    }
}
