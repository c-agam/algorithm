package com.agam.algorithm.core;

/**
 * 快速排序
 * 时间复杂度：
 * 最好：O(nlogn)
 * 最坏：O(n2)
 */
public class QuickSort {
    public static void quickSort(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int boundary = boundary(array, startIndex, endIndex);
        quickSort(array, startIndex, boundary - 1);
        quickSort(array, boundary + 1, endIndex);
    }

    private static int boundary(int[] array, int startIndex, int endIndex) {
        int standard = array[startIndex]; // 定义标准
        int leftIndex = startIndex; // 左指针
        int rightIndex = endIndex; // 右指针

        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && array[rightIndex] >= standard) {
                rightIndex--;
            }
            array[leftIndex] = array[rightIndex];

            while (leftIndex < rightIndex && array[leftIndex] <= standard) {
                leftIndex++;
            }
            array[rightIndex] = array[leftIndex];
        }

        array[leftIndex] = standard;
        return leftIndex;
    }

    public static void main(String[] args) {
        int[] array = {1, 9, 3, 4, 8, 2};
        QuickSort.quickSort(array, 0, array.length - 1);
    }
}
