package com.company.ds.search.binarysearch;

public class BinarySearch {

    public int binarySearch(int[] a, int x) {
        int p = 0;
        int r = a.length - 1;
        while (p <= r) {
            int q = (p + r) / 2;
            if (a[q] == x) {
                return q;
            }
            if (a[q] > x) {
                r = q - 1;
            } else {
                p = q + 1;
            }
        }
        return -1;
    }
}
