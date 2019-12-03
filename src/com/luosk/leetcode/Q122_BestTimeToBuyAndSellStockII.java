package com.luosk.leetcode;

public class Q122_BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        return maxProfit_01(prices);
    }

    private int maxProfit_01(int[] prices) {
        if (prices == null || prices.length == 0) { return 0; }
        int max = 0;
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] > prices[i - 1]) {
                max += (prices[i] - prices[i - 1]);
            }
        }

        return max;
    }
}
