package com.company.ds.stack;


public class Main {

    public static void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push("Google");
        stackLinkedList.push("Twitter");
        stackLinkedList.push("Youtube");
        stackLinkedList.push("Instagram");

        System.out.println("Top :" + stackLinkedList.peek().data);
        System.out.println("Length :" + stackLinkedList.getLength());

        stackLinkedList.pop();
        System.out.println("Top :" + stackLinkedList.peek().data);
        System.out.println("Length :" + stackLinkedList.getLength());
        stackLinkedList.pop();
        System.out.println("Top :" + stackLinkedList.peek().data);
        System.out.println("Length :" + stackLinkedList.getLength());

        System.out.println("Bottom :" + stackLinkedList.getBottom().data);
    }

}
