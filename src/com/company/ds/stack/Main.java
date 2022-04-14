package com.company.ds.stack;


public class Main {

    public static void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push("Google");
        stackLinkedList.push("Twitter");
        stackLinkedList.push("Youtube");
        stackLinkedList.push("Instagram");

        System.out.println(stackLinkedList.peek());
        System.out.println(stackLinkedList.getLength());

        stackLinkedList.pop();
        System.out.println(stackLinkedList.peek());
        System.out.println(stackLinkedList.getLength());
    }

}
