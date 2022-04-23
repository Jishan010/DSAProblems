package com.company.algorithms.recurssion.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] numbers = {7, 5, 9, 6, 4, 8, 3, 2, 44, 678, 4, 33, 0, 234, 89, 67, 39, 93, 100};
        insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] insertionSort(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            int j = i - 1;
            while (j >= 0) {
                if (numbers[j] > numbers[i]) {
                    //swap both indexes of array
                    numbers[i] = numbers[j] + numbers[i] - (numbers[j] = numbers[i]);
                    i--;
                }
                j--;
            }
        }
        return numbers;
    }


}
