package ru.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task66Test {

    @Test
    void whenArray1234() {
        int[] result = {1, 2, 3, 4};
        assertArrayEquals(new Task66().plusOne(result), new int[]{1, 2, 3, 5});
    }

    @Test
    void whenArray999() {
        int[] result = {9, 9, 9};
        assertArrayEquals(new Task66().plusOne(result), new int[]{1, 0, 0, 0});
    }

    @Test
    void whenArray989() {
        int[] result = {9, 8, 9};
        assertArrayEquals(new Task66().plusOne(result), new int[]{9, 9, 0});
    }

    @Test
    void whenArray899() {
        int[] result = {8, 9, 9};
        assertArrayEquals(new Task66().plusOne(result), new int[]{9, 0, 0});
    }
}