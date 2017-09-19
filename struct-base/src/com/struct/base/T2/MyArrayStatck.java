package com.struct.base.T2;

import java.util.Arrays;

/**
 * Created by wangyonghua on 2017/9/19.
 */
public class MyArrayStatck {
    public int capacity;
    public int index;
    public String[] array;

    public MyArrayStatck() {
        this.capacity = 5;
        this.index = 0;
        array = new String[capacity];
    }

    public void push(String data) {
        if (index == capacity - 1) {
            enLarge();
        }
        array[index] = data;
        index++;
    }

    public String peek() {
        return array[index - 1];
    }

    public String pop() {
        String val = array[index - 1];
        index--;
        return val;
    }

    public int size() {
        return index;
    }

    public boolean empty() {
        return index == 0;
    }

    public void enLarge() {
        this.capacity = this.capacity * 2;
        String[] newArray = Arrays.copyOf(array, this.capacity);
        array = newArray;
    }
}
