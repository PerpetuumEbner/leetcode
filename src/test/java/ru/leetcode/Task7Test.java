package ru.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task7Test {

    @Test
    public void newHumber123() {
        assertEquals(new Task7().reverse(123), 321);
    }

    @Test
    public void newHumberMinus123() {
        assertEquals(new Task7().reverse(-123), -321);
    }

    @Test
    public void newHumber120() {
        assertEquals(new Task7().reverse(120), 21);
    }

}