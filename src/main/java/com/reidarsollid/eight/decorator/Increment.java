package com.reidarsollid.eight.decorator;

public class Increment extends IntQueueDecorator {
    public Increment(IntQueue intQueue) {
        super(intQueue);
    }

    @Override
    public int get() {
        return super.get();
    }

    @Override
    public void put(int element) {
        element += 1;
        super.put(element);
    }
}
