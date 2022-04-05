package com.company.ds.array;

import java.util.Arrays;

/*
 * Program to Merge two sorted array*/
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] numbers1 = {1, 3, 4, 31, 55, 78, 90};
        int[] numbers2 = {4, 6, 30, 44};
        int[] mergeSortedArray = mergeSortedArray(numbers1, numbers2);
        System.out.println(Arrays.toString(mergeSortedArray));
    }

    private static int[] mergeSortedArray(int[] firstNumbers, int[] secondNumbers) {
        int[] mergeSortedArray = new int[firstNumbers.length + secondNumbers.length];
        int i = 0;
        int j = 0;
        int k = 0;

        //comparing both value from from equal index , if value of first array is small we increament i else j
        while (i < firstNumbers.length && j < secondNumbers.length) {
            if (firstNumbers[i] <= secondNumbers[j]) {
                mergeSortedArray[k] = firstNumbers[i];
                i++;
            } else {
                mergeSortedArray[k] = secondNumbers[j];
                j++;
            }
            k++;
        }

        // directly insert all the remaining items of first array if it is greater than second array
        while (i < firstNumbers.length) {
            mergeSortedArray[k] = firstNumbers[i];
            i++;
            k++;
        }

        // directly insert all the remaining items of second array if it is greater than first array
        while (j < secondNumbers.length) {
            mergeSortedArray[k] = firstNumbers[j];
            j++;
            k++;
        }
        return mergeSortedArray;
    }
}
