package com.luosk.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q051_NQueens {
    public List<List<String>> solveNQueens(int n) {
        return solveNQueens_01(n);
    }

    private List<List<String>> solveNQueens_01(int n) {
        List<List<String>> result = new ArrayList<>();

        return result;
    }

    private void helper(List<List<String>> result, char[][] board, int row, int n) {
        if (row == n) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < board.length; ++i) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < board[i].length; ++j) {
                    sb.append(board[i][j]);
                }
                list.add(sb.toString());
            }
            result.add(list);
            return;
        }

        for (int i = 0; i < board[row].length; ++i) {
            board[row][i] = 'Q';

        }
    }
}
