package com.jamison.jianzhi_offer.day24;

/**
 * <a href="https://leetcode.cn/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/solution/shou-hui-tu-jie-liang-chong-bian-li-de-ce-lue-na-c/">...</a>
 */
class SpiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) {
            return new int[]{};
        }
        int top = 0;
        int left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int[] res = new int[(bottom + 1) * (right + 1)];
        int index = 0;
        while(top < bottom && left < right) {
            for(int i = left; i < right; i++) {
                res[index++] = matrix[top][i];
            }
            for(int i = top; i < bottom; i++) {
                res[index++] = matrix[i][right];
            }
            for(int i = right; i > left; i--) {
                res[index++] = matrix[bottom][i];
            }
            for(int i = bottom; i > top; i--) {
                res[index++] = matrix[i][left];
            }
            top++;
            left++;
            right--;
            bottom--;
        }
        if(top == bottom) {
            for(int i = left; i <= right; i++) {
                res[index++] = matrix[top][i];
            }
        }
        //剩下一列
        else if(left == right) {
            for(int i = top; i <= bottom; i++) {
                res[index++] = matrix[i][top];
            }
        }
        return res;
    }
}
