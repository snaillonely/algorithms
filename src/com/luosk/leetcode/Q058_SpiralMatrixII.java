package com.luosk.leetcode;

public class Q058_SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        return generateMatrix_01(n);
    }

    private int[][] generateMatrix_01(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < i; ++j) {
                matrix[i][i + j] = num++;
            }

            for (int j = 0; j < i; ++j) {
                matrix[i + j][i] = num++;
            }

            for (int j = 0; j < i; ++j) {
                matrix[i][i - j] = num++;
            }

            for (int j = 0; j < i; ++j) {
                matrix[i - j][i] = num++;
            }
        }

        if (n % 2 == 1) {
            matrix[(n + 1) / 2][(n + 1) / 2] = num;
        }

        return matrix;
    }
}
