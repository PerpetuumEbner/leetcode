package ru.leetcode;

public class Task35 {
    public int searchInsert(int[] nums, int target) {
        int result = 0;

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target || nums[index] > target) {
                result = index;
                break;
            }

            if (index == nums.length - 1) {
                result = nums.length;
            }
        }
        return result;
    }
}
