package com.luosk.leetcode;

public class Q048_RotateImage {

    public void rotate(int[][] matrix) {

    }

    private void rotate_01(int[][] matrix) {
        if (matrix == null || matrix.length == 0) { return; }
        int left = 0, right = matrix.length - 1, top = 0, bottom = matrix.length - 1;
        while (left < right && top < bottom) {
            helper(matrix, left++, top++, right--, bottom--);
        }
    }

    private void helper(int[][] matrix, int left, int top, int right, int bottom) {
        for (int i = 0; i < (right - left); ++i) {
            int temp = matrix[top][left + i];
            matrix[top][left + i] = matrix[bottom - i][left];
            matrix[bottom - i][left] = matrix[bottom][right - i];
            matrix[bottom][right - i] = matrix[top + i][right];
            matrix[top + i][right] = temp;
        }
    }
}
