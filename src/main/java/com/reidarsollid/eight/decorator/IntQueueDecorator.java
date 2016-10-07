package com.reidarsollid.eight.decorator;

public class IntQueueDecorator implements IntQueue {
    protected final IntQueue intQueueDecorator;

    public IntQueueDecorator(IntQueue intQueue) {
        this.intQueueDecorator = intQueue;
    }

    public int get() {
        return intQueueDecorator.get();
    }

    public void put(int element) {
        intQueueDecorator.put(element);
    }
}
