package ru.leetcode;

import java.util.HashMap;

public class Task1 {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            map.put(nums[index], index);
        }

        for (int index = 0; index < nums.length; index++) {
            int value = target - nums[index];
            if (map.containsKey(value) && !map.get(value).equals(index)) {
                return new int[]{nums[index], value};
            }
        }
        throw new IllegalArgumentException("Not found!");
    }
}