package com.struct.base.T1;

/**
 * Created by wangyonghua on 2017/9/14.
 */
public class DLink {
    DNode head;

    public DLink() {
        head = new DNode();
        head.next = null;
        head.prior = null;
    }

    public void add(String data) {
        DNode p = head;
        while (p.next != null) {
            p = p.next;
        }
        DNode addNode = new DNode(data);
        p.next = addNode;
        addNode.prior = p;
    }

    public void delNode(String data) {
        DNode p = head;
        if (p.next == null)
            return;
        while (p.next != null) {
            if (p.next.name.equals(data)) {
                p.next.next.prior = p.next.prior;
                p.next = p.next.next;
                break;
            } else {
                p = p.next;
            }
        }
    }

    public void display() {
        DNode p = head;
        while (p.next != null) {
            System.out.println(p.next.name + ">>>>>");
            p = p.next;
        }
    }

    public void find(String data) {
        DNode p = head;
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
        DNode p = head;
        while (p.next != null) {
            if (p.next.name.equals(param)) {
                DNode t = p.next;
                DNode insertNode = new DNode(data);
                insertNode.prior = t.prior;
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
        DNode p = head;
        while (p.next != null) {
            p = p.next;
            n++;
        }
        return n;
    }
}
