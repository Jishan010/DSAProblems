package com.company;

public class Counter {
    private int counter=0;
    private String name = null;

    Counter(String str) {
        this.name = str;
    }

    public void increment() {
        counter++;
    }

    public Integer getCurrentValue() {
        return counter;
    }

    public String toString() {
        return name + ":" + counter;
    }
}
