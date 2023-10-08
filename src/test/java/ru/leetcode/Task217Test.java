package ru.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task217Test {

    @Test
    public void whenElementsMatch() {
        int[] array = new int[]{1, 2, 3, 1};
        assertTrue(new Task217().containsDuplicate(array));
    }

    @Test
    public void whenElementsDontMatch() {
        int[] array = new int[]{1, 2, 3, 4};
        assertFalse(new Task217().containsDuplicate(array));
    }
}