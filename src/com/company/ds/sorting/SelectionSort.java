package com.company.ds.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] myArray = selectionSort(new int[]{9, 8, 3, 13, 87, 12, 99, 1, 200, 300});
        for (int j : myArray) {
            System.out.println(j);
        }
    }

    private static int[] selectionSort(int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            int minimumValue = i;
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[j] < unsortedArray[minimumValue]) {
                    minimumValue = j;
                }
            }

            // swap with extra variable temp
            /*int temp = unsortedArray[i];
            unsortedArray[i] = unsortedArray[minimumValue];
            unsortedArray[minimumValue] = temp;*/

            // swap unsorted[i] with unsortedArray[minimum] value
            unsortedArray[minimumValue] = (unsortedArray[i] + unsortedArray[minimumValue]) - (unsortedArray[i] = unsortedArray[minimumValue]);
        }
        return unsortedArray;
    }
}
