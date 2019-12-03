package com.luosk.leetcode;

public class Q121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        return maxProfit_01(prices);
    }

    private int maxProfit_01(int[] prices) {
        if (prices == null || prices.length < 2) { return 0; }

        int max = 0, profit = 0;
        for (int i = 1; i < prices.length; ++i) {
            if (profit + prices[i] - prices[i - 1] > 0) {
                profit += (prices[i] - prices[i - 1]);
                max = Math.max(max, profit);
            } else {
                profit = 0;
            }
        }

        return max;
    }
}
