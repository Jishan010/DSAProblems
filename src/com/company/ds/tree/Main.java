package com.company.ds.tree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.newInsert(9);
        bst.newInsert(4);
        bst.newInsert(6);
        bst.newInsert(20);
        bst.newInsert(170);
        bst.newInsert(15);
        bst.newInsert(1);

        //it will throw null pointer exception if passed value doesn't exist in tree
        System.out.println(bst.lookup(1).data);
    }
}
