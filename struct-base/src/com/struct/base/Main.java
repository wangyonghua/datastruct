package com.struct.base;

import com.struct.base.T1.CLink;

public class Main {

    public static void main(String[] args) {
        // write your code here
        CLink cLink = new CLink();
        cLink.add("组长");
        cLink.add("经理");
        cLink.add("副总");
        cLink.add("总经理");

        cLink.display();
        cLink.size();
        cLink.delNode("总经理");
        cLink.display();
        cLink.size();
    }
}
