package ru.leetcode;

public class Task67 {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int temp = 0;

        while (i >= 0 || j >= 0) {
            int sum = temp;
            if (i >= 0) {
                sum += (a.charAt(i) - '0');
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);
            temp = sum / 2;
        }

        if (temp != 0) {
            result.append(temp);
        }

        return result.reverse().toString();
    }
}
