package ru.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task20Test {

    private final Task20 task = new Task20();

    @Test
    public void testValidParentheses() {
        assertTrue(task.isValid("()"));
        assertTrue(task.isValid("()[]{}"));
        assertTrue(task.isValid("{[]}"));
        assertTrue(task.isValid("({[]})"));
        assertTrue(task.isValid(""));
    }

    @Test
    public void testInvalidParentheses() {
        assertFalse(task.isValid("(]"));
        assertFalse(task.isValid("([)]"));
        assertFalse(task.isValid("((("));
        assertFalse(task.isValid(")))"));
        assertFalse(task.isValid("(}{)"));
        assertFalse(task.isValid("[{]}"));
    }

    @Test
    public void testMixedCharacters() {
        assertTrue(task.isValid("a(b)c[d]e{f}g"));
        assertFalse(task.isValid("a(b]c"));
    }

    @Test
    public void testSingleCharacters() {
        assertFalse(task.isValid("("));
        assertFalse(task.isValid(")"));
        assertFalse(task.isValid("["));
        assertFalse(task.isValid("]"));
        assertFalse(task.isValid("{"));
        assertFalse(task.isValid("}"));
    }
}