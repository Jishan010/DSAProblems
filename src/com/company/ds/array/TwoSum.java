package com.company.ds.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int[] missingNumber = findTwoSum(numbers, 9);
        System.out.println(Arrays.toString(missingNumber));
    }

    private static int[] findTwoSum(int[] numbers, int targetNumber) {
        int[] array = new int[2];
        if (numbers == null) {
            return null;
        }

        if (numbers.length <= 2) {
            array[0] = 0;
            array[1] = 1;
            return array;
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == targetNumber) {
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }
        return array;
    }
// todo watch better solutions on discussion

}
