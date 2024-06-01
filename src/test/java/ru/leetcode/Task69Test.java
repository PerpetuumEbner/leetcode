package ru.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task69Test {


    @Test
    void mySqrt_64() {
        Task69 task69 = new Task69();
        assertEquals(task69.mySqrt(64), 8);
    }

    @Test
    void mySqrt_8() {
        Task69 task69 = new Task69();
        assertEquals(task69.mySqrt(8), 2);
    }
}