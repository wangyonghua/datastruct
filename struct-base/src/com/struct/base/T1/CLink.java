package com.struct.base.T1;

/**
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
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node(data);
    }

    public void delNode(String data) {
        Node p = head;
        if (p.next == null)
            return;
        while (p.next != null) {
            if (p.next.name.equals(data)) {
                p.next = p.next.next;
                break;
            } else {
                p = p.next;
            }
        }
    }

    public void display() {
        Node p = head;
        while (p.next != null) {
            System.out.println(p.next.name + ">>>>>");
            p = p.next;
        }
    }

    public void find(String data) {
        Node p = head;
        while (p.next != null) {
            if (p.next.name.equals(data)) {
                System.out.println(p.next.name);
                break;
            } else {
                p = p.next;
            }
        }
    }

    public void insert(String param, String data) {
        Node p = head;
        while (p.next != null) {
            if (p.next.name.equals(param)) {
                Node t = p.next;
                Node insertNode = new Node(data);
                insertNode.next = t.next;
                t.next = insertNode;
                break;
            } else {
                p = p.next;
            }
        }
    }

    public int size() {
        int n = 0;
        Node p = head;
        while (p.next != null) {
            p = p.next;
            n++;
        }
        return n;
    }
}
