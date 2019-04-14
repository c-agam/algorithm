package com.agam.algorithm.core;

/**
 * 堆排序
 * 排序时间复杂度：O(nlgn)
 * 建堆时间复杂度：O(n)
 * 堆调整时间复杂度：O(h)
 */
public class HeapSort {

    /**
     * 堆排序
     * 时间复杂度O(nlgn)
     *
     * @param arr
     */
    public static void heapSort(int[] arr) {
        int heapSize = arr.length;
        buildMaxHeap(arr, heapSize);
        for (int j = arr.length; j > 1; ) {
            j--;
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            heapSize = heapSize - 1;
            maxHeapify(arr, 1, heapSize);
        }
    }


    /**
     * 建堆
     * 时间复杂度 O(n)
     *
     * @param arr
     */
    public static void buildMaxHeap(int[] arr, int heapSize) {
        int i = (heapSize / 2) + 1;
        while (i > 1) {
            i--;
            maxHeapify(arr, i, heapSize);
        }
    }

    /**
     * 堆调整
     * 时间复杂度：O(h)
     *
     * @param arr
     * @param j
     */
    private static void maxHeapify(int[] arr, int j, int heapSize) {

        int left = 2 * j - 1;
        int right = 2 * j;

        int largest = j;
        if (left + 1 <= heapSize && arr[left] > arr[j - 1]) {
            largest = left + 1;
        }

        if (right + 1 <= heapSize && arr[right] > arr[largest - 1]) {
            largest = right + 1;
        }

        if (largest != j) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[largest - 1];
            arr[largest - 1] = temp;
            maxHeapify(arr, largest, heapSize);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        //建堆
        buildMaxHeap(arr, arr.length);

        //排序
        heapSort(arr);
        System.out.println();

    }
}
