package com.reidarsollid.eight.decorator;

import java.util.LinkedList;


public class BasicIntQueue implements IntQueue{
    LinkedList<Integer> queue;
    public BasicIntQueue() {
        queue = new LinkedList<Integer>();
    }

    @Override
    public int get() {
        return queue.pop();
    }

    @Override
    public void put(int x) {
        queue.add(x);
    }
}
