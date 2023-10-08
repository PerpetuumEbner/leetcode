package ru.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Task217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        for (int num : nums) {
            if (!integers.add(num)) {
                return true;
            }
        }
        return false;
    }
}