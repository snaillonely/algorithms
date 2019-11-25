package com.luosk.leetcode;

import java.util.*;

public class Q049_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        return groupAnagrams_01(strs);
    }

    private List<List<String>> groupAnagrams_01(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String key = calculate(strs[i]);
            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key, list);
            }
        }

        for (List<String> list : map.values()) {
            result.add(list);
        }

        return result;

    }

    private String calculate(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }
}
