package com.company.ds.search.linearsearch;

public class Main {

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int[] numbers = {4, 5, 6, 8, 9, 7};
        int answer = linearSearch.linearSearch(numbers, 9);
        System.out.println(answer);
    }

}
