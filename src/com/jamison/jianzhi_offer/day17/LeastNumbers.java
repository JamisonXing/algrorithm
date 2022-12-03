package com.jamison.jianzhi_offer.day17;

import java.util.Arrays;

/**
 * @author jamison
 * https://leetcode.cn/problems/zui-xiao-de-kge-shu-lcof/solution/jian-zhi-offer-40-zui-xiao-de-k-ge-shu-j-9yze/
 */
class LeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1);
        return Arrays.copyOf(arr, k);
    }

    private void quickSort(int[] arr, int l, int r) {
        if(l >= r) {return;}
        int i = l, j = r;
        while(i < j) {
            while(i < j && arr[j] >= arr[l]) {j--;}
            while(i < j && arr[i] <= arr[l]) {i++;}
            swap(arr, i ,j);
        }
        swap(arr, l ,i);
        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}