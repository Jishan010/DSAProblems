package com.company.ds.array;

public class ReverseString {

    public static void main(String[] args) {
        String someText = "Hi my name is Jishan Ansari";
        String reverseString = simplifiedReverseString(someText);
        /*String reverseString = reverseStringUsingArray(someText);*/
        System.out.println(reverseString);
    }

    // easy solution
    public static String simplifiedReverseString(String targetString) {
        char[] chars = targetString.toCharArray();
        StringBuilder reverseString = new StringBuilder();
        for (int i = chars.length-1 ; i >= 0 ; i--){
            reverseString.append(chars[i]);
        }
        return reverseString.toString();
    }

    //core solution
    public static String reverseStringUsingArray(String targetString){
        if (targetString == null || targetString.length() < 2)
        {
            return "Not a proper String boy !!!";
        }
        int textSize = targetString.length() - 1;
        char[] chars = new char[targetString.length()];
        for (int i = textSize ; i >= 0 ; i--){
            chars[textSize - i] = targetString.charAt(i);
        }
        return String.copyValueOf(chars);
    }
}


