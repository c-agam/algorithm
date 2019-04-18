package com.agam.algorithm.core;

/**
 * 归并排序
 * 时间复杂度：O(nlgn)
 */
public class MergeSort {

    public static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(array, start, mid); //左边排序
            mergeSort(array, mid + 1, end); // 右边排序
            merge(array, start, mid, end); //归并
        }
    }

    public static void merge(int[] array, int start, int mid, int end) {
        int i = start, j = mid + 1, k = start;
        int[] tmp = new int[array.length];

        while (i != mid + 1 && j != end + 1) {
            if (array[i] < array[j]) {
                tmp[k++] = array[i++];
            } else {
                tmp[k++] = array[j++];
            }
        }

        while (i != mid + 1) {
            tmp[k++] = array[i++];
        }
        while (j != end + 1) {
            tmp[k++] = array[j++];
        }

        for (i = start; i <= end; i++) {
            array[i] = tmp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 7, 4};
        mergeSort(arr, 0, arr.length - 1);
    }
}
