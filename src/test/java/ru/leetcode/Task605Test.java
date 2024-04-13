package ru.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task605Test {

    @Test
    void whenPlant1Flower() {
        Task605 task605 = new Task605();
        int[] flowerbed = {1, 0, 0, 0, 1};
        assertTrue(task605.canPlaceFlowers(flowerbed, 1));
    }

    @Test
    void whenPlant2Flower1() {
        Task605 task605 = new Task605();
        int[] flowerbed = {0, 0, 1, 0, 0};
        assertTrue(task605.canPlaceFlowers(flowerbed, 2));
    }

    @Test
    void whenPlantNoFlower() {
        Task605 task605 = new Task605();
        int[] flowerbed = {0, 1, 0, 1, 0};
        assertFalse(task605.canPlaceFlowers(flowerbed, 1));
    }

    @Test
    void whenPlant2Flower2() {
        Task605 task605 = new Task605();
        int[] flowerbed = {1, 0, 0, 0, 0, 1};
        assertFalse(task605.canPlaceFlowers(flowerbed, 2));
    }

    @Test
    void whenPlantZeroFlower() {
        Task605 task605 = new Task605();
        int[] flowerbed = {1, 0, 0, 0, 0, 1};
        assertTrue(task605.canPlaceFlowers(flowerbed, 0));
    }
}