package com.company.ds.search.binarysearch;

public class Main {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] numbers = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int answer = binarySearch.binarySearch(numbers, 11);
        System.out.println(answer);
    }

}
