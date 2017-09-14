package com.struct.base.T1;

/**
 * Created by wangyonghua on 2017/9/14.
 */
public class Link {
    Node head;

    public Link() {
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
        while (p!=null) {
            p = p.next;
        }

    }
}
