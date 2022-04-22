package com.company.algorithms.recurssion.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {7, 5, 9, 6, 4, 8, 3, 2};
        int[] sortedNumbers = bubbleSort(numbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }

    public static int[] bubbleSort(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //{3,7,4,3,9,4}  here if number[5] is less than number[4] then swap
                if (numbers[j] > numbers[j + 1]) {
                    numbers[j] = numbers[j] + numbers[j + 1] - (numbers[j + 1] = numbers[j]);
                }
            }
        }

        return numbers;
    }


}
