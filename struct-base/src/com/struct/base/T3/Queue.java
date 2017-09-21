package com.struct.base.T3;

/**
 * Created by wangyonghua on 2017/9/20.
 */
public class Queue {
    Node head;

    public Queue() {
        head = new Node();
    }

    //入队  队尾
    public void inQueue(String data) {
        Node p = head;

        while (p.next != null) {
            p = p.next;
        }
        Node node = new Node(data);
        p.next = node;

    }

    public Node outQueue() {
        Node p = head;
        if (p.next != null) {
            Node node = p.next;
            head.next = p.next.next;
            return node;
        }
        return null;
    }
}
