package ru.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Task1Test {

    @Test
    public void whenSumArrayValueIs9() {
        var task1 = new Task1();
        int[] array = new int[]{2, 7, 11, 15};
        assertArrayEquals(task1.twoSum(array, 9), new int[]{2, 7});
    }

    @Test
    public void whenSumArrayValueIs6() {
        var task1 = new Task1();
        int[] array = new int[]{3, 2, 4};
        assertArrayEquals(task1.twoSum(array, 6), new int[]{2, 4});
    }

    @Test
    public void whenSumArrayValueIs12() {
        var task1 = new Task1();
        int[] array = new int[]{1, 6, 4, 4, 6};
        assertArrayEquals(task1.twoSum(array, 12), new int[]{6, 6});
    }

    @Test
    public void whenSumArrayValueIs10() {
        var task1 = new Task1();
        int[] array = new int[]{5, 5};
        assertArrayEquals(task1.twoSum(array, 10), new int[]{5, 5});
    }
}