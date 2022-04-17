package com.company.warmup;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String result = missingChar("kitten", 1);
        System.out.println(result);

        String frontBackResult = shortSolnForFrontBack("code");
        System.out.println(frontBackResult);

        String front3Result = front3("jo");
        System.out.println(front3Result);
        String front3Result1 = front3("jone");
        System.out.println(front3Result1);


        String backAroundResult = backAround("jone");
        System.out.println(backAroundResult);

       boolean multipleof5or3 =  or35(7);
        System.out.println(multipleof5or3);
    }

    /**
     * @param str
     * @param n   index suggestting to remove the char which is at given indec
     * @return
     */
    public static String missingChar(String str, int n) {
        if (n > str.length() - 1) {
            return null;
        }
        String front = str.substring(0, n);

        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(n + 1, str.length());
        return front + back;
    }


    /**
     * replace front char with back and back char with front in string
     *
     * @param str
     * @return
     */
    //solution using array
    public static String frontBack(String str) {
        if (null == str || str.isEmpty()) {
            return "";
        }
        char[] newString = new char[str.length()];
        char frontString = str.charAt(0);
        char backString = str.charAt(str.length() - 1);

        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                newString[i] = backString;
            } else if (i == str.length() - 1) {
                newString[i] = frontString;
            } else {
                newString[i] = str.charAt(i);
            }
        }
        return String.copyValueOf(newString);
    }

    /**
     * replace front char with back and back char with front in string
     *
     * @param str
     * @return
     */
    //solution using substring
    public static String shortSolnForFrontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length() - 1);

        // last + mid + first
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }


    /**
     * Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3,
     * the front is whatever is there. Return a new string which is 3 copies of the front.
     *
     * @param str
     * @return
     */
    public static String front3(String str) {
        String front;
        if (str.length() < 3)
            front = str;
        else
            front = str.substring(0, 3);
        return front + front + front;
    }

    /**
     *
     Given a string, take the last char and return a new string with the
     last char added at the front and back, so "cat" yields "tcatt".
     The original string will be length 1 or more.
     backAround("cat") → "tcatt"
     backAround("Hello") → "oHelloo"
     backAround("a") → "aaa"
     * @param str
     * @return
     */
    public static String backAround(String str) {
        // Get the last char
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    /**
     * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
     * @param n
     * @return
     */
    public static boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

}
