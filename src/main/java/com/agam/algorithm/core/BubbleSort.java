package com.agam.algorithm.core;

/**
 * 冒泡排序
 * 时间复杂度:O(n2)
 */
public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 9, 3, 4, 8, 2};
        bubbleSort(array);
    }
}