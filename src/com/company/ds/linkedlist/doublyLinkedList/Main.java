package com.company.ds.linkedlist.doublyLinkedList;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(10);
        linkedList.append(82);
        linkedList.append(12);
        linkedList.append(22);

        linkedList.preAppend(8);
        linkedList.preAppend(6);

        linkedList.insert(2, 5);
        linkedList.insert(5, 66);

        linkedList.remove(4);
        linkedList.remove(6);

        System.out.println(linkedList);

        System.out.println("Size of this Linked list is : " + linkedList.getLength());
        System.out.println("Head of Linked list is : " + linkedList.getHead().data);
        System.out.println("Tail of Linked list is : " + linkedList.getTail().data);

        List<Node> nodes = linkedList.printAllNode();
        for (Node data : nodes) {
            if (data.nextNode != null && data.prevNode != null) {
                System.out.println("Current Node data : " + data.data + " | Next Node data :" + data.nextNode.data + " | previous Node data:" + data.prevNode.data);
            } else if (data.prevNode != null) {
                System.out.println("Current Node data : " + data.data + " | Previous Node data :" + data.prevNode.data );
            } else if (data.nextNode != null) {
                System.out.println("Current Node data : " + data.data + " | Next Node data :" + data.nextNode.data);
            } else {
                System.out.println("Current Node data : " + data.data);
            }
        }
    }
}
