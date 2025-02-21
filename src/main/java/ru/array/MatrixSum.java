package ru.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] elF : array) {
            for (int el : elF) {
                rsl += el;
            }
        }
        return rsl;
    }
}