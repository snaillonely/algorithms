package com.luosk.leetcode;


// todo: review
public class Q037_SudokuSolver {
    public void solveSudoku(char[][] board) {
        solveSudoku_01(board);
    }

    private void solveSudoku_01(char[][] board) {
        if (board == null || board.length == 0) { return; }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {

                    }
                }
            }
        }
    }
}
