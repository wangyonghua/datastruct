package com.struct.base.T4;

/**
 * Created by wangyonghua on 2017/9/25.
 */
public class TestNode {
    public static void main(String[] args) {
        BTree bTree = new BTree(10);
        bTree.addNode(8);
        bTree.addNode(7);
        bTree.addNode(20);
        bTree.addNode(90);
        bTree.addNode(100);
        bTree.addNode(3);
        bTree.addNode(6);
        bTree.addNode(1);
        bTree.addNode(-10);

        bTree.display(bTree.root);
        System.out.println("ok");
        bTree.display1(bTree.root);
        System.out.println("ok");
        bTree.display2(bTree.root);
        System.out.print("ok");
    }
}
