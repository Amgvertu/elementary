package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int i = 0;
        money -= price;
        while (money > 0) {
                rsl[size] = coins[i];
                money -= coins[i];
                size++;
            if (money < coins[i]) {
                i++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
