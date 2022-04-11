package com.company.ds.linkedlist;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(10);
        linkedList.append(12);
        linkedList.append(14);
        linkedList.append(16);

        linkedList.preAppend(8);
        linkedList.preAppend(6);

        System.out.println(linkedList);

        System.out.println("Size of this Linked list is : "+linkedList.getLength());

        List<Node> nodes=linkedList.printAllNode();
        for(Node data : nodes){
            System.out.println(data.data);
        }
    }

}
