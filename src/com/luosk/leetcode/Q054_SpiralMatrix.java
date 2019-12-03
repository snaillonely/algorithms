package com.luosk.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q054_SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        return spiralOrder_01(matrix);
    }

    private List<Integer> spiralOrder_01(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) { return result; }
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

        while (left < right && top < bottom) {
            for (int i = left; i < right; ++i) {
                result.add(matrix[top][i]);
            }

            for (int i = top; i < bottom; ++i) {
                result.add(matrix[i][right]);
            }

            for (int i = right; i > left; --i) {
                result.add(matrix[bottom][i]);
            }

            for (int i = bottom; i > top; --i) {
                result.add(matrix[i][left]);
            }

            ++left; ++top; --right; --bottom;
        }

        if (left == right) {
            for (int i = top; i <= bottom; ++i) {
                result.add(matrix[i][left]);
            }
        } else if (top == bottom) {
            for (int i = left; i <= right; ++i) {
                result.add(matrix[top][i]);
            }
        }

        return result;
    }
}
