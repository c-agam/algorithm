package com.agam.algorithm.core;

/**
 * 冒泡排序
 * 平均时间复杂度：O(n2)
 * 最优时间复杂度：O(n)
 */
public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            boolean doSwap = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    doSwap = true;
                }
            }
            if(!doSwap) return;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 9, 3, 4, 8, 2};
        bubbleSort(array);
    }
}
