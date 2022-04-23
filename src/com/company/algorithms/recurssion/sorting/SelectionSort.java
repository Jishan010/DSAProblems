package com.company.algorithms.recurssion.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {7, 5, 9, 6, 4, 8, 3, 2, 44, 678, 4, 33, 0, 234, 89, 67, 39, 93, 100};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] selectionSort(int[] numbers) {
        if (numbers.length <= 1) {
            return numbers;
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                //{3,7,4,3,9,4}  here if number[5] is less than number[4] then swap
                if (numbers[i] > numbers[j]) {
                    numbers[j] = numbers[j] + numbers[i] - (numbers[i] = numbers[j]);
                }
            }
        }
        return numbers;
    }


}
