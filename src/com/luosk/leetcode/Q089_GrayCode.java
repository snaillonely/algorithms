package com.luosk.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q089_GrayCode {
    public List<Integer> grayCode(int n) {
        return grayCode_01(n);
    }

    private List<Integer> grayCode_01(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        for (int i = 0; i < n; ++i) {
            for (int j = result.size() - 1; j >= 0; --j) {
                result.add(result.get(j) + (1 << i));
            }
        }

        return result;
    }
}
