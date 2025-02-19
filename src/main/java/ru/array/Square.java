package ru.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] sqr = new int[bound];
        for (int i = 0; i <= bound - 1; i++) {
            sqr[i] = i * i;
        }
        return sqr;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int element : array) {
            System.out.println(element);
        }
    }
}
