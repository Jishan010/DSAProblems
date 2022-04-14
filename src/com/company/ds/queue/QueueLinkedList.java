package com.company.ds.queue;

public class QueueLinkedList {
    int length;
    Node first;
    Node last;

    QueueLinkedList() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public void enqueue(String value) {
        Node newNode = new Node(value);
        if (length == 0) {
            this.first = newNode;
            this.last = first;
        } else {
            this.last.nextNode = newNode;
            this.last = newNode;
        }
        this.length++;
    }

    public void dequeue() {
        if (length == 0) {
            this.first = null;
            this.last = null;
        } else {
            this.first = this.first.nextNode;
        }
        this.length--;
    }

    public Node peek() {
        return this.first;
    }

    public Node getLast() {
        return this.last;
    }

    public int getLength() {
        return this.length;
    }

}
