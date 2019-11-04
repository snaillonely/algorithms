package com.luosk.leetcode;

public class Q006_ZigZagConversion {
    public String convert(String s, int numRows) {
        return convert_01(s, numRows);
    }

    private String convert_01(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += (numRows - 1) * 2) {
                sb.append(s.charAt(j));
                if (i != 0 && i != numRows - 1 && j + (numRows - 1 - i) * 2 < s.length()) {
                    sb.append(s.charAt(j + (numRows - 1 - i) * 2));
                }
            }
        }

        return sb.toString();
    }

    private String convert_02(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }

        for (int i = 0; i < s.length(); i++) {
            int idx = i % (2 * numRows - 2);
            idx = idx < numRows ? idx : 2 * numRows - 2 - idx;
            sb[idx].append(s.charAt(i));
        }

        for (int i = 1; i < numRows; i++) {
            sb[0].append(sb[i]);
        }

        return sb[0].toString();
    }
}
