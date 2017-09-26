package com.struct.base.T4;

/**
 * Created by wangyonghua on 2017/9/26.
 * <p>
 * 数组模拟二叉树
 */
public class BTreeArray {
    int data[];
    int size;

    public BTreeArray(int dat) {
        size = 33;
        this.data = new int[size];
        data[1] = dat;
    }

    public BTreeArray(int size, int dat) {
        this.size = size;
        this.data = new int[size];
        data[1] = dat;
    }

    public void add(int dat) {
        int i = 1;
        while (true) {
            if (data[i] > dat) {
                i = i * 2;
                if (data[i] == 0) {
                    data[i] = dat;
                    break;
                }
            } else {
                i = i * 2 + 1;
                if (data[i] == 0) {
                    data[i] = dat;
                    break;
                }
            }
        }
    }

    public void display() {
        for (int i = 1; i < size; i++) {
            System.out.println(i + "," + data[i]);
        }
    }

    public static void main(String[] args) {
        BTreeArray bTree = new BTreeArray(10);
        bTree.add(8);
        bTree.add(7);
        bTree.add(20);
        bTree.add(90);
        bTree.add(100);
        bTree.add(3);
        bTree.add(6);
        bTree.add(1);
        bTree.add(-10);

        bTree.display();
    }
}
