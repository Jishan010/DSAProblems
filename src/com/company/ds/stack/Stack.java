package com.company.ds.stack;

public class Stack {

    private int maxSize;
    private int top;
    private char[] charsArray;


    public Stack(int maxSize){
        this.maxSize = maxSize;
        this.charsArray = new char[maxSize];
        top=-1;
    }

    public void push(char alphabate){
        if (isStackIsFull()){
            System.out.println("Stack is full");
        }
        else {
            top++;
            charsArray[top] = alphabate;
        }
    }

    public char pop(){
        if (isStackIsEmpty()){
            System.out.println("Stack is empty");
            return '0';
        }
        else{
            int oldPop = top;
            top--;
            return charsArray[oldPop];
        }
    }

    public  boolean isStackIsFull(){
        return maxSize-1 == top;
    }

    public  boolean isStackIsEmpty(){
        return top == -1;
    }

}
