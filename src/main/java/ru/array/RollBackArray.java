package ru.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }
}

