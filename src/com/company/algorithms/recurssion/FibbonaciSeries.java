package com.company.algorithms.recurssion;

public class FibbonaciSeries {


    public static void main(String[] args) {

        int targetIndex = 8;
        int[] array = new int[targetIndex + 1];
        fibonacciSeries(0, array);
        int value = array[targetIndex];
        System.out.println("index value of " + targetIndex + " in fibonacci series is: " + value);
    }

    public static int fibonacciSeries(int index, int[] array) {
        if (index == 0) {
            array[0] = 0;
        } else if (index == 1) {
            array[1] = 1;
        } else {
            int total = array[index - 2] + array[index - 1];
            array[index] = total;
        }
        if (index == array.length - 1) {
            return array[index];
        }
        fibonacciSeries(index + 1, array);
        return 0;
    }

}
