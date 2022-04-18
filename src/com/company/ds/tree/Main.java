package com.company.ds.tree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.newInsert(1);
        bst.newInsert(2);
        bst.newInsert(3);
        bst.newInsert(4);
        bst.newInsert(5);
        bst.newInsert(6);
        //it will throw null pointer exception if passed value doesn't exist in tree
        System.out.println(bst.lookup(1).data);

        Node rootNode = bst.getRoot();
        int length = bst.maxDepth(rootNode);
        System.out.println(length);
    }
}
