package com.company.ds.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    Node head;
    Node tail;
    int length = 0;

    LinkedList(Integer value) {
        Node node = new Node();
        node.data = value;
        node.nextNode = null;
        this.head = node;
        this.tail = head;
        length++;
    }

    /**
     * Function to append the node to the linkedList
     * time complexity is O(1)
     *
     * @param value
     */
    public void append(Integer value) {
        //created new node
        Node newNode = new Node();
        newNode.data = value;
        newNode.nextNode = null;

        this.tail.nextNode = newNode;
        this.tail = newNode;

        length++;
    }

    /**
     * Function to pre-append the node to the linkedList
     * time complexity is O(1)
     *
     * @param value
     */
    public void preAppend(Integer value) {
        //create new node
        Node newNode = new Node();
        newNode.data = value;
        newNode.nextNode = head;

        this.head = newNode;
        length++;
    }

    /**
     * Function to insert in between two nodes of linked list
     * @param index given index against which user want to enter the new node
     * @param value int value for new node
     * @return Node [Node]
     */
    public Node insert(int index, int value) {

        // create new node with given value
        Node newNode = new Node();
        newNode.data = value;
        newNode.nextNode = null;

        int i = 0;
        Node currentNode = head;
        while (currentNode != null) {
            if(i == index-1){
                newNode.nextNode = currentNode.nextNode;
                currentNode.nextNode = newNode;
            }
            currentNode = currentNode.nextNode;
            i++;
        }

        return newNode;
    }


    /**
     * Function to print all the nodes of linked list
     * time complexity is O(n)
     *
     * @return List<Node>
     */
    public List<Node> printAllNode() {
        ArrayList<Node> nodes = new ArrayList<>();
        Node givenNode = head;
        while (givenNode != null) {
            nodes.add(givenNode);
            givenNode = givenNode.nextNode;
        }
        return nodes;
    }

    /**
     * Function to get size of linked list
     *
     * @return
     */
    public int getLength() {
        return length;
    }

    /**
     * Function to get head of arraylist
     *
     * @return
     */
    public Node getHead() {
        return head;
    }

    /**
     * Function to get tail of arraylist
     *
     * @return
     */
    public Node getTail() {
        return tail;
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
