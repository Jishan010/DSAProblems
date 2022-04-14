package com.company.ds.stack;

public class StackLinkedList {
    int length;
    Node top;
    Node bottom;
    StackLinkedList() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public void push(String value) {
        if (length == 0) {
            this.top = new Node(value);
            this.bottom = top;
        } else {
            Node newNode = new Node(value);
            newNode.nextNode = this.top;
            this.top = newNode;
        }
        this.length++;
    }

    public void pop() {
        if (length == 0) {
            this.top = null;
            this.bottom = null;
        } else {
            this.top = top.nextNode;
        }
        this.length--;
    }

    public Node peek(){
        return this.top;
    }

    public Node getBottom(){
        return this.bottom;
    }

    public int getLength(){
        return this.length;
    }

}
