package ru.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task70Test {

    @Test
    public void whenSteps_1() {
        Task70 task70 = new Task70();
        assertEquals(task70.climbStairs(1), 1);
    }

    @Test
    public void whenSteps_4() {
        Task70 task70 = new Task70();
        assertEquals(task70.climbStairs(4), 5);
    }

    @Test
    public void whenSteps_9() {
        Task70 task70 = new Task70();
        assertEquals(task70.climbStairs(9), 55);
    }
}