package com.luosk.leetcode;

public class Q063_UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return uniquePathsWithObstacles_01(obstacleGrid);
    }

    private int uniquePathsWithObstacles_01(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) { return 0; }
        int rows = obstacleGrid.length, cols = obstacleGrid[0].length;

        int[][] dp = new int[rows][cols];
        dp[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for (int i = 1; i < cols; ++i) {
            dp[0][i] = obstacleGrid[0][i] == 1 ? 0 : dp[0][i - 1];
        }

        for (int i = 1; i < rows; ++i) {
            dp[i][0] = obstacleGrid[i][0] == 1 ? 0 : dp[i - 1][0];
        }

        for (int i = 1; i < rows; ++i) {
            for (int j = 1; j < cols; ++j) {
                dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[rows - 1][cols - 1];
    }
}
