package com.company.ds.array;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] numbers = {9,6,4,2,3,5,7,0,1};
        int missingNumber = findMissingNumber(numbers);
        System.out.println(missingNumber);
    }

    private static int findMissingNumber(int[] numbers) {
        Arrays.sort(numbers);
        //0,1,3
        if(numbers[numbers.length-1] != numbers.length)
            return numbers.length;

        for(int i = 0 ; i < numbers.length ; i++ ){
            if(i != numbers[i])
                return i;
        }
        return -1;
    }
}
