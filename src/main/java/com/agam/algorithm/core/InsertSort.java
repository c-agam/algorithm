package com.agam.algorithm.core;

/**
 * 插入排序
 * 时间复杂度：O(n2)
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] seq = {3, 2, 1, 9, 6, 7};
        sort(seq);
        System.out.println(seq);
    }

    public static void sort(int[] seq) {
        for (int j = 1; j < seq.length; j++) {
            int key = seq[j];
            int i = j - 1;
            while (i >= 0 && seq[i] > key) {
                seq[i + 1] = seq[i];
                i = i - 1;
            }
            seq[i + 1] = key;
        }
    }
}
