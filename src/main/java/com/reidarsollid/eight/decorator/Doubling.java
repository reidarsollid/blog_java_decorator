package com.reidarsollid.eight.decorator;

public class Doubling extends IntQueueDecorator {
    public Doubling(IntQueue intQueue) {
        super(intQueue);
    }

    @Override
    public int get() {
        return super.get();
    }

    @Override
    public void put(int element) {
        element = element * 2;
        super.put(element);
    }
}