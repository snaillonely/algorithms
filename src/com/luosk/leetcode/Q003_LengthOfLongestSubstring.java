package com.luosk.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q003_LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        return lengthOfLongestSubstring_01(s);
    }

    private int lengthOfLongestSubstring_01(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            result = Math.max(result, i - j + 1);
        }

        return result;
    }

    private int lengthOfLongestSubstring_02(String s) {
        int result = 0;
        Set<Character> set = new HashSet<>();

        int head = 0, tail = 0;
        while (head < s.length()) {
            if (!set.contains(s.charAt(head))) {
                set.add(s.charAt(head++));
                result = Math.max(result, set.size());
            } else {
                set.remove(s.charAt(tail++));
            }
        }

        return result;
    }

}
