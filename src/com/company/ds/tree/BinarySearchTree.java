package com.company.ds.tree;

public class BinarySearchTree {

    Node root;

    BinarySearchTree() {
        this.root = null;
    }

    public void newInsert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }

        Node currentNode = root;
        while (true) {
            if (newNode.data > currentNode.data) {
                //right
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    return;
                } else
                    currentNode = currentNode.right;
            } else {
                //left
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    return;
                } else
                    currentNode = currentNode.left;
            }
        }
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        boolean isRight = false;
        if (root == null) {
            root = newNode;
            return;
        }

        Node currentNode = root;
        Node parentNode = root;
        while (currentNode != null) {
            if (newNode.data > currentNode.data) {
                //right
                parentNode = currentNode;
                currentNode = currentNode.right;
                isRight = true;
            } else {
                //left
                parentNode = currentNode;
                currentNode = currentNode.left;
                isRight = false;
            }
        }

        if (isRight) {
            parentNode.right = newNode;
        } else
            parentNode.left = newNode;
    }


    public Node lookup(int value) {
        boolean isPresent = false;
        if (root == null) {
            return null;
        }
        Node currentNode = root;
        while (currentNode != null) {
            if (value > currentNode.data) {
                currentNode = currentNode.right;
            } else if (value < currentNode.data) {
                currentNode = currentNode.left;
            } else {
                return currentNode;
            }
        }
        return null;
    }
}
