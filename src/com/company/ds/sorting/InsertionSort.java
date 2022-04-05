package com.company.ds.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] myArray = insertionSort(new int[]{9, 8, 3, 13, 87, 5, 34, 6, 499, 12, 99, 1, 200, 300});
        for (int j : myArray) {
            System.out.println(j);
        }
    }

    private static int[] insertionSort(int[] unsortedArray) {
        for (int i = 1; i < unsortedArray.length ; i++) {
            int element = unsortedArray[i]; // element variable contains the data we intend on bringing over to the sorted area
            int j = i - 1; // j variable points to the index position of the last value in the sorted area
            while (j >= 0 && unsortedArray[j] > element) {
                unsortedArray[j + 1] = unsortedArray[j];
                j--;
            }
            unsortedArray[j + 1] = element;
        }
        return unsortedArray;
    }
}
