package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        for (int coin : coins) {
            while (money >= coin) {
                rsl[size++] = coin;
                money -= coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
