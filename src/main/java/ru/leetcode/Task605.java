package ru.leetcode;

public class Task605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean result = false;
        int counterPlantedFlowers = 0;

        if (n == 0) {
            return true;
        }

        for (int index = 0; index < flowerbed.length; index++) {
            if (flowerbed[index] == 0
                    && (index == flowerbed.length - 1 || flowerbed[index + 1] == 0)
                    && (index == 0 || flowerbed[index - 1] == 0)) {
                flowerbed[index] = 1;
                counterPlantedFlowers++;
                index++;
            }

            if (counterPlantedFlowers == n) {
                return true;
            }
        }
        return result;
    }
}