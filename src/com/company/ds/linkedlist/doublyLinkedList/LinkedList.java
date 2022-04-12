package com.company.ds.linkedlist.doublyLinkedList;

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
        node.prevNode = null;
        this.head = node;
        this.tail = head;
        length++;
    }

    /**
     * Function to append the node to the doubly linkedList
     * time complexity is O(1)
     *
     * @param value
     */
    public void append(Integer value) {
        //created new node
        Node newNode = new Node();
        newNode.data = value;
        newNode.nextNode = null;

        tail.nextNode = newNode;
        newNode.prevNode = tail;
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
        newNode.prevNode = null;

        this.head.prevNode = newNode;
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
        newNode.prevNode = null;

        int i = 0;
        Node currentNode = head;
        while (currentNode != null) {

            //update the head
            if (i == index && index == 0) {
                newNode.nextNode = currentNode;
                this.head = newNode;
                length++;
                return newNode;
            }

            //if given index is greater than our list then apend it to end of the list
            if (index >= getLength()) {
                append(value);
                return newNode;
            }

            //update the middle node
            if (i == index - 1) {
                Node nextOfNewNode = currentNode.nextNode;

                currentNode.nextNode = newNode;
                nextOfNewNode.prevNode = newNode;
                newNode.nextNode = nextOfNewNode;
                newNode.prevNode = currentNode;
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

        //update the head
        if (i == index && index == 0) {
            currentNode.nextNode.prevNode = null;
            this.head = currentNode.nextNode;
            length--;
            return currentNode;
        }

        if (index >= getLength() - 1) {
            this.tail.prevNode.nextNode = null;
            length--;
            return this.tail.prevNode;
        }

        while (currentNode != null) {
            //update the middle node
            if (i == index - 1) {
                removedNode = currentNode.nextNode;

                Node nextNodeOfRemovedNode = removedNode.nextNode;
                Node prevNodeOfRemovedNode = removedNode.prevNode;

                prevNodeOfRemovedNode.nextNode = nextNodeOfRemovedNode;
                nextNodeOfRemovedNode.prevNode = prevNodeOfRemovedNode;

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
