package com.luosk.leetcode;

import java.util.Arrays;

public class Q056_MergeIntervals {
    public int[][] merge(int[][] intervals) {
        return merge_01(intervals);
    }

    private int[][] merge_01(int[][] intervals) {
        if (intervals == null || intervals.length == 0 || intervals[0].length == 0) { return intervals; }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int cur = 0;
        for (int i = 1; i < intervals.length; ++i) {
            if (intervals[i][0] > intervals[cur][1]) {
                ++cur;
                intervals[cur][0] = intervals[i][0];
                intervals[cur][1] = intervals[i][1];
                continue;
            }

            intervals[cur][1] = Math.max(intervals[cur][1], intervals[i][1]);
        }

        int[][] result = new int[cur + 1][2];
        for (int i = 0; i <= cur; ++i) {
            result[i] = intervals[i];
        }

        return result;
    }
}
