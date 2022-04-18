package com.company.algorithms.recurssion;

/**
 * Recursive have usually 3 points
 * 1. Identify the base case
 * 2. Identify the recursive case
 * 3. Get closer and closer and return when needed. Usually you have 2 returns.
 */
public class Factorial {

    public static void main(String[] args) {
        int factorial = findFactorial(5);
        System.out.println("factorial using recursive: " +factorial);

        int factorial2 = findFactorialUsingForLoop(5);
        System.out.println("factorial using for loop: " +factorial2);

    }

    /**
     *  Find the factorial of given number using recursive method
     *
     *  5! = 5 * 4 * 3 * 2 * 1
     *  5! = 5* 4!
     *  4! = 4* 3!
     *  3! = 3 * 2!
     *  2! = 2 * 1!
     *  1! = 1
     * @return int factorial of given number in parameter
     */
    private static int findFactorial(int number){
        //base case
        if(number == 2){
            return 2;
        }
        // recursive case
        return  number * findFactorial(number - 1);
    }


    private static int findFactorialUsingForLoop(int number){
        int answer = 1;
        for ( int i = 2 ; i <= number ; i++){
            answer = answer * i;
        }
        // recursive case
        return  answer;
    }

}
