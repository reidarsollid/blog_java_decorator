package com.reidarsollid.eight.decorator;

public class Decorating {
    public static void main(String[] args) {
        IntQueue intQueue = new BasicIntQueue();
        intQueue.put(2);
        System.out.println(intQueue.get());

        intQueue = new Doubling(intQueue);
        intQueue.put(2);
        System.out.println(intQueue.get());

        intQueue = new Increment(intQueue);
        intQueue.put(2);
        System.out.println(intQueue.get());
    }
}
