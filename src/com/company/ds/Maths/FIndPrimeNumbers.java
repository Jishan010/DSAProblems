package com.company.ds.Maths;

public class FIndPrimeNumbers {

    public static void main(String[] args) {
        printAllThePrimeNumbers(30);
    }

    /**
     * Program to print all the prime numbers between 1 and given number  by using the formula
     * concept that prime number is the number which cannot be devided by anyother number other than one and itself
     * 1 2 3 4 5 6 7 8 9 10
     * i.e reminder will be always non-zero  ex i % 2 != 0 , i % 3 != 0
     *
     * @param toNumbers number till which we have to find prime number
     */
    private static void printAllThePrimeNumbers(int toNumbers) {
        for (int i = 1; i <= toNumbers; i++) {
            boolean isPrime = true;
            // here to find the given i is prime or not we will divide number i with 2 to i-1 , since prime number can be divided from 1 and itself that is i here
            for (int j = 2 ; j <=  i -1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }


}
