package com.jamison.jianzhi_offer.day29;

class PrintNumbers {
    public int[] printNumbers(int n) {
        int sum = (int)Math.pow(10, n);
        int[] res = new int[sum - 1];
        for(int i = 1; i <= sum - 1; i++) {
            res[i - 1] = i;
        }
        return res;
    }
}
