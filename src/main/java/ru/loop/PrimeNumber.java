package ru.loop;

import static ru.loop.CheckPrimeNumber.check;

public class PrimeNumber {
    public static int calc(int number) {
        int count = 0;
        for (int i = 2; i <= (number); i++) {
            if (check(i)) {
                count++;
            }
        }
        return count;
    }
}
