package com.luosk.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q030_SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        return findSubstring_01(s, words);
    }

    private List<Integer> findSubstring_01(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || words == null || words.length == 0) { return result; }
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        int n = s.length(), num = words.length, len = words[0].length();
        for (int i = 0; i < n - num * len + 1; i++) {
            Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            while (j < num) {
                String word = s.substring(i + j * len, i + (j + 1) * len);
                if (counts.containsKey(word) && seen.getOrDefault(word, 0) < counts.get(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                } else {
                    break;
                }
                j++;
            }

            if (j == num) {
                result.add(i);
            }
        }

        return result;
    }
}
