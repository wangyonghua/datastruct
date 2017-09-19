package com.struct.base.T2;

/**
 * Created by wangyonghua on 2017/9/19.
 */
public class MyStack {

    Node head;

    public MyStack() {
        head = new Node();
        head.next = null;
    }

    public void push(String data) {
        Node node = new Node(data);
        node.next = head.next;
        head.next = node;
    }

    public String pop() {
        if (head.next != null) {
            String name = head.next.name;
            head.next = head.next.next;
            return name;
        }
        return "";
    }

    public String peek() {
        if (head.next != null)
            return head.next.name;
        return "";
    }

    public boolean empty() {
        return head.next == null;
    }

    public int search(String data) {
        if (head.next == null) return 0;
        int n = 0;
        Node p = head.next;
        while (p.next != null) {
            if (head.name.equals(data)) {
                n++;
                return n;
            } else {
                p = p.next;
            }
        }
        if (p.name.equals(data)) {
            return n + 1;
        } else {
            return -1;
        }
    }

    public int size() {
        if (head.next == null) return 0;
        Node p = head.next;
        int n = 1;
        while (p.next != null) {
            n++;
            p = p.next;
        }
        return n;
    }
}
