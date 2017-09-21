package com.struct.base.T3;

/**
 * Created by wangyonghua on 2017/9/21.
 */
public class QueryArray {
    Object[] obj;
    int front, rear, size;

    public QueryArray() {
        size = 11;
        front = 0;
        rear = 0;
        obj = new Object[size];
    }

    public QueryArray(int size) {
        size = size + 1;
        front = 0;
        rear = 0;
        obj = new Object[size];
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void inQueue(String data) {
        if (isFull()) {
            System.out.println("已满");
            return;
        }
        rear = (rear + 1) % size;
        obj[rear] = data;
    }

    public void outQueue() {
        if (!isEmpty()) {
            front = (front + 1) % size;
            Object val = obj[front];
            System.out.println(val);
        } else {
            System.out.println("队列为空");
        }
    }

    public void display() {
        System.out.println("begin-----");
        int f = front;
        int r = rear;
        while (f != r) {
            System.out.println(obj[f + 1]);
            f = (f + 1) % size;
        }
        System.out.println("end------");
    }
}
