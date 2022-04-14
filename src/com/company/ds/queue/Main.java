package com.company.ds.queue;


public class Main {

    public static void main(String[] args) {
        QueueLinkedList queueLinkedList = new QueueLinkedList();
        queueLinkedList.enqueue("Joy");
        queueLinkedList.enqueue("Matt");
        queueLinkedList.enqueue("Pavel");
        queueLinkedList.enqueue("Sameer");

        System.out.println("Top :" + queueLinkedList.peek().data);
        System.out.println("Length :" + queueLinkedList.getLength());

        queueLinkedList.dequeue();
        System.out.println("Top :" + queueLinkedList.peek().data);
        System.out.println("Length :" + queueLinkedList.getLength());
        queueLinkedList.dequeue();
        System.out.println("Top :" + queueLinkedList.peek().data);
        System.out.println("Length :" + queueLinkedList.getLength());

        System.out.println("Bottom :" + queueLinkedList.getLast().data);
    }
}
