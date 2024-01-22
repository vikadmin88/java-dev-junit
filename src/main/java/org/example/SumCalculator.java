package org.example;

public class SumCalculator {

    public int sum(int num) {
        if (num < 1) {
            throw new IllegalArgumentException("Invalid argument: " + num);
        }

        int result = 0;
        for (int i = 1; i <= num; i++) {
            result = result + i;
        }
        return result;
    }
}
