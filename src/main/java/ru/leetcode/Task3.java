package ru.leetcode;

import java.util.HashMap;

public class Task3 {

    public int lengthOfLongestSubstring(String string) {
        char[] chars = string.toCharArray();
        var map = new HashMap<>();
        int maxValue = 0;
        int uniqCount = 0;
        for (int index = 0; index < chars.length - 1; index++) {
            if (map.containsKey(chars[index])) {
                uniqCount = 0;
            }
            map.put(chars[index], index);
            uniqCount++;
            maxValue = Math.max(maxValue, uniqCount);

        }
        System.out.println(maxValue);
        return maxValue;
    }
}