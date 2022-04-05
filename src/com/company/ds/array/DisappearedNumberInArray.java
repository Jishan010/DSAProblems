package com.company.ds.array;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumberInArray {

    public static void main(String[] args) {
        int[] numbers = {4,3,2,7,8,2,3,1};
      /*  int maxNumber = findMaxNumberFromArray(numbers);
        System.out.println(maxNumber);*/
        /*boolean isNumPresent = checkIfNumberIsPresent(9,numbers);
        System.out.println(isNumPresent);*/
        List<Integer> disappearedNumbs = findDisappearedNumbers(numbers);
        System.out.println(disappearedNumbs);
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        //Creating a List of type String using ArrayList
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!checkIfNumberIsPresent(i, nums)) {
                list.add(i);
            }
        }
        return list;
    }

    private static int findMaxNumberFromArray(int[] nums) {
        int maxNumber = 0;
        for (int number : nums) {
            if (number > maxNumber)
                maxNumber = number;
        }
        return maxNumber;
    }

    private static boolean checkIfNumberIsPresent(int numberToCheck, int[] nums) {
        for (int number : nums) {
            if (number == numberToCheck)
                return true;
        }
        return false;
    }
    //todo study cyclic sort to sort algorithm to to solve this problem by improving time complexity
}
