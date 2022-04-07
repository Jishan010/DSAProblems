package com.company.ds.array;

import java.util.Arrays;

public class SingleNumber {

    public static void main(String[] args) {
        int[] numbers = {5,5,8,8,7,9,9,2,2};
        int singleNumber = findSingleNumber(numbers);
        System.out.println(singleNumber);
    }

    // my solution with array
    private static int findSingleNumber(int[] numbers) {
        //sort the array first to make it loop better , we can just compare next index to previous index if its equal to former or not
        Arrays.sort(numbers);
        //2,2,5,5,7,8,8,9,9
        // check if the numbers are 2 digit or single digit , if it is we cannot retrieve the single value which apeared twice
        if (numbers.length < 1)
            return numbers[0];

        // login to loop through the elements with the intervals of 2 , and compare values next to it
        int  index = 0;
        while (index < numbers.length){
            if (index == numbers.length-1){
                return numbers[index];
            }
            if(numbers[index] != numbers[index+1]){
                return numbers[index];
            }
            index = index+ 2;
        }
        return -1;
    }
    //todo learn solution with bitwise operations
}
