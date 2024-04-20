package ru.leetcode;

public class Task14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String result = strs[0];

        for (int index = 0; index < strs.length; index++) {
            while (strs[index].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty()) {
                    return "";
                }
            }
        }
        return result;
    }
}