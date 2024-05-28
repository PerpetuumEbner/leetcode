package ru.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task67Test {

    @Test
    void addBinary_100() {
        Task67 task67 = new Task67();
        assertEquals(task67.addBinary("11", "1"), "100");
    }

    @Test
    void addBinary_10101() {
        Task67 task67 = new Task67();
        assertEquals(task67.addBinary("1010", "1011"), "10101");
    }

    @Test
    void addBinary_11101() {
        Task67 task67 = new Task67();
        assertEquals(task67.addBinary("1110", "1111"), "11101");
    }
}