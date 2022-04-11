package com.company.ds.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    Node head ;
    Node tail ;
    int length = 0;

    LinkedList(Integer value){
        Node node = new Node();
        node.data = value;
        node.nextNode = null;
        this.head = node;
        this.tail = head;
        length++;
    }

    public void append(Integer value){
        //created new node
        Node newNode = new Node();
        newNode.data = value;
        newNode.nextNode = null;

        this.tail.nextNode = newNode;
        this.tail = newNode;

        length++;
    }

    public void preAppend(Integer value){
        //create new node
        Node newNode = new Node();
        newNode.data = value;
        newNode.nextNode = head;

        this.head = newNode;
        length++;
    }


    public List<Node> printAllNode(){
        ArrayList<Node> nodes = new ArrayList<>();
        Node givenNode = head;
        while (givenNode != null){
            nodes.add(givenNode);
            givenNode = givenNode.nextNode;
        }
        return nodes;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head.data +
                ", tail=" + tail.data +
                ", length=" + length +
                '}';
    }
}
