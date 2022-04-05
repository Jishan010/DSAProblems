package com.company;

import com.company.ds.stack.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Counter counter=new Counter("Demo");
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println(counter.getCurrentValue());
        counter.increment();
        counter.increment();
        System.out.println(counter.getCurrentValue());*/

       String reversedName = reverserName("Jishan is My Name");
       System.out.println(reversedName);
    }


    public static String reverserName(String name){
        char[] nameChar = name.toCharArray();
        StringBuilder reversedName = new StringBuilder();
        Stack stack = new Stack(nameChar.length);
        for (char c : nameChar) {
            stack.push(c);
        }
        while (!stack.isStackIsEmpty())
        {
           reversedName.append(stack.pop());
        }
        return reversedName.toString();
    }

}
