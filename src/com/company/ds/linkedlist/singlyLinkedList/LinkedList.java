package com.company.ds.linkedlist.singlyLinkedList;

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
     * time complexity O(n)
     *
     * @param index given index against which user want to enter the new node
     * @param value int value for new node
     * @return Node [Node]
     */
    public Node insert(int index, int value) {

        // create new node with given value
        Node newNode = new Node();
        newNode.data = value;
        newNode.nextNode = null;

        Node currentNode = head;

        //update the head
        if (index == 0) {
            newNode.nextNode = currentNode;
            this.head = newNode;
            length++;
            return newNode;
        }

        int i = 0;
        //if given index is greater than our list then apend it to end of the list
        if (index >= getLength()) {
            append(value);
            return newNode;
        }

        while (currentNode != null) {

            //update the middle node
            if (i == index - 1) {
                newNode.nextNode = currentNode.nextNode;
                currentNode.nextNode = newNode;
                length++;
                return newNode;
            }
            currentNode = currentNode.nextNode;
            i++;
        }

        return newNode;
    }


    /**
     * Function to insert in between two nodes of linked list
     *
     * @param index given index against which user want to enter the new node
     * @return Node [Node]
     */
    public Node remove(int index) {
        int i = 0;
        Node removedNode = null;
        Node currentNode = head;
        while (currentNode != null) {
            //update the head
            //update the head
            if (i == index && index == 0) {
                this.head = currentNode.nextNode;
                length--;
                return currentNode;
            }

            //update the middle node
            if (i == index - 1) {
                removedNode = currentNode.nextNode;
                currentNode.nextNode = currentNode.nextNode.nextNode;
                length--;
                return removedNode;
            }
            currentNode = currentNode.nextNode;
            i++;
        }
        return null;
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

    public void reverseLinkedList() {
        Node firstNode = head;
        Node secondNode = firstNode.nextNode;

        while (secondNode != null){
            Node temp = secondNode.nextNode;
            secondNode.nextNode = firstNode;
            firstNode = secondNode;
            secondNode = temp;
        }
        this.head.nextNode = null;
        this.head = firstNode;
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
