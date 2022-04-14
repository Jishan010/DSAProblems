package com.company.ds.stack;

public class StackLinkedList {

    String top;
    String bottom;
    int length;
    Node head = null;

    StackLinkedList() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public void push(String value) {
        if (length == 0) {
            this.head = new Node(value);
        } else {
            Node newNode = new Node(value);
            bottom = head.data;
            newNode.nextNode = this.head;
            this.head = newNode;
        }
        top = head.data;
        length++;
    }

    public void pop() {
        if (length == 0) {
            this.head = null;
        } else {
            this.head = head.nextNode;
        }
        top = head.data;
        length--;
    }

    public String peek(){
        return top;
    }

    public int getLength(){
        return length;
    }

}
