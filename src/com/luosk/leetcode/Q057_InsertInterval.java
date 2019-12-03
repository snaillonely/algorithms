package com.luosk.leetcode;

import java.util.Arrays;

public class Q057_InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        return insert_01(intervals, newInterval);
    }

    private int[][] insert_01(int[][] intervals, int[] newinterval) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        return null;
    }
}
