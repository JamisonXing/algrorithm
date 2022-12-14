package com.jamison.jianzhi_offer.day17;

import java.util.Arrays;

/**
 * @author jamison
 * 方法2
 * https://leetcode.cn/problems/zui-xiao-de-kge-shu-lcof/solution/jian-zhi-offer-40-zui-xiao-de-k-ge-shu-j-9yze/
 */
class LeastNumbers2 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k >= arr.length) {
            return arr;
        }
        return quickSort(arr, 0, arr.length - 1, k);
    }

    private int[] quickSort(int[] arr, int l, int r, int k) {
        int i = l, j = r;
        while(i < j) {
            while(i < j && arr[j] >= arr[l]) {j--;}
            while(i < j && arr[i] <= arr[l]) {i++;}
            swap(arr, i ,j);
        }
        swap(arr, l ,i);
        if(k < i){
            return quickSort(arr, l, i - 1, k);
        }
        if(k > i){
            return quickSort(arr, i + 1, r, k);
        }
        return Arrays.copyOf(arr, k);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}