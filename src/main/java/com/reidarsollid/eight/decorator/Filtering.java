package com.reidarsollid.eight.decorator;

public class Filtering extends IntQueueDecorator {
    public Filtering(IntQueue intQueue) {
        super(intQueue);
    }

    @Override
    public int get() {
        return super.get();
    }

    @Override
    public void put(int element) {
        if (element >= 0) {
            super.put(element);
        }
    }
}