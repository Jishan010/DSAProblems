package com.company.ds.linkedlist;

public class App {

    public static void main (String[] args){
        Node nodeA = new Node();
        nodeA.data=4;

        Node nodeB = new Node();
        nodeB.data=3;

        Node nodeC = new Node();
        nodeC.data=7;

        Node nodeD = new Node();
        nodeD.data=8;

        nodeA.nextNode = nodeB;
        nodeB.nextNode = nodeC;
        nodeC.nextNode = nodeD;

        System.out.println(listLength(nodeA));
    }

    public static int listLength(Node node) {
        int length = 0;
        Node currentNode = node;
        while (currentNode != null ){
            currentNode = currentNode.nextNode;
            length++;
        }
        return length;
    }
}


