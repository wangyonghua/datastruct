package com.struct.base.T4;

/**
 * Created by wangyonghua on 2017/9/22.
 * 链表模拟二叉树
 */
public class BTree {

    Node root;

    public BTree(int data) {
        root = new Node(data);
    }

    public void addNode(int data) {
        Node p = root;
        Node t = new Node(data);
        while (true) {
            if (p.data > data) {
                if (p.leftChild != null) {
                    p = p.leftChild;
                } else {
                    p.leftChild = t;
                    break;
                }
            } else {
                if (p.rightChild != null) {
                    p = p.rightChild;
                } else {
                    p.rightChild = t;
                    break;
                }
            }
        }
    }

    public void display(Node node) {
        //先根遍历
        System.out.println(node.data);

        //找左边
        if (node.leftChild != null) {
            display(node.leftChild);
        }

        //找右边
        if (node.rightChild != null) {
            display(node.rightChild);
        }
    }

    public void display1(Node node) {
        //找左边
        if (node.leftChild != null) {
            display(node.leftChild);
        }

        //中根遍历
        System.out.println(node.data);

        //找右边
        if (node.rightChild != null) {
            display(node.rightChild);
        }
    }

    public void display2(Node node) {
        //找左边
        if (node.leftChild != null) {
            display(node.leftChild);
        }


        //找右边
        if (node.rightChild != null) {
            display(node.rightChild);
        }

        //后根遍历
        System.out.println(node.data);
    }
}
