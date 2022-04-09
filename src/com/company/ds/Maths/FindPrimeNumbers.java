package com.company.ds.Maths;

import java.util.Arrays;

public class FindPrimeNumbers {

    public static void main(String[] args) {
        /*printAllThePrimeNumbers(10000);*/
        primeSieveOfEratosthenes(10000);
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

    /**
     * Get prime numbers from given range using Sieve of Eratosthenes
     * // ref video https://www.youtube.com/watch?v=nDPo9hsDNvU&t=2s&ab_channel=ApnaCollege
     */
    private static void primeSieveOfEratosthenes(int toNumbers) {
        int[] array = new int[toNumbers+1];
        //filling array with 1 values which defaults as number is prime
        Arrays.fill(array,1);
        for (int i = 2; i <= toNumbers; i++) {
            if(array[i] != 0) {
                for (int j = i * i; j <= toNumbers; j += i) {
                    array[j] = 0;
                }
            }
        }

        //print the indexes of array which are prime that is 0 in it.
        for(int i = 1 ; i < array.length ; i++)
        {
            if(array[i] == 1)
                System.out.println("prime numbers :" +i);
        }
    }
}
