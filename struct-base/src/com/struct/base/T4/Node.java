package com.struct.base.T4;

/**
 * Created by wangyonghua on 2017/9/22.
 * 链表模拟二叉树
 */
public class Node {
    int data;
    Node leftChild;
    Node rightChild;

    public Node(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}
