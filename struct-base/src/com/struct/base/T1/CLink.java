package com.struct.base.T1;

/**
 * 单项列表
 * Created by wangyonghua on 2017/9/14.
 */
public class CLink {
    Node head;

    public CLink() {
        head = new Node();
        head.next = null;
    }

    public void add(String data) {
        Node p = head;
        if (p.next == null) {
            Node temp = new Node(data);
            p.next = temp;
            temp.next = temp;
            return;
        }
        p = p.next;
        while (p.next != head.next) {
            p = p.next;
        }
        Node temp = new Node(data);
        p.next = temp;
        temp.next = head.next;

    }

    public void delNode(String data) {
        Node p = head.next;
        if (p != null && p.name.equals(data) && p.next == head.next) {
            head.next = null;
        }
        while (p.next != head.next) {
            if (p.name.equals(data)) {
                p.next = p.next.next;
                break;
            } else {
                if (p.next.name.equals(data) && p.next.next == head.next) {
                    p.next = head.next;
                    return;
                }
                p = p.next;
            }
        }
    }

    public void display() {
        Node p = head.next;
        while (p.next != head.next) {
            System.out.println(p.name + ">>>>>");
            p = p.next;
        }
        System.out.println(p.name + ">>>>");
    }

    public void size() {
        Node p = head.next;
        int n = 1;
        while (p.next != head.next) {
            n++;
            p = p.next;
        }
        System.out.println(n);
    }
}
