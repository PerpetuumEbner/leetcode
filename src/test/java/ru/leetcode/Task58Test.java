package ru.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task58Test {

    @Test
    void whenStringHello_World() {
        Task58 task58 = new Task58();
        Assertions.assertEquals(task58.lengthOfLastWord("Hello World"), 5);
    }

    @Test
    void whenString_fly_me_to_the_moon_() {
        Task58 task58 = new Task58();
        Assertions.assertEquals(task58.lengthOfLastWord("   fly me   to   the moon  "), 4);
    }
}