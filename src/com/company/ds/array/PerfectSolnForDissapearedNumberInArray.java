package com.company.ds.array;

import java.util.ArrayList;
import java.util.List;

public class PerfectSolnForDissapearedNumberInArray {


    public static void main(String[] args) {
        int[] numbers = {4,3,2,7,8,2,3,1};
        List<Integer> disappearedNumbs = findDisappearedNumbers(numbers);
        System.out.println(disappearedNumbs);
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;

        //program for cyclic sort algorithm , helpful if numbers are in sequence
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex])
                swap(arr, i, correctIndex);
            else i++;
        }
//         find missing number
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1)
                ans.add(index + 1);
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}


