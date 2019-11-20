package com.luosk.leetcode;

public class Q038_CountAndSay {
    public String countAndSay(int n) {
        return countAndSay_01(n);
    }

    private String countAndSay_01(int n) {
        String str = "1";
        while (--n > 0) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char c = str.charAt(0);
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(c);
                    count = 1;
                    c = str.charAt(i);
                }
            }
            sb.append(count);
            sb.append(c);

            str = sb.toString();
        }

        return str;
    }
}
