package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        boolean flag = false;
        int[] result = new int[2];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (target == (array[i] + array[j])) {
                    result[0] = i;
                    result[1] = j;
                    flag = true;
                    break;
                }

            }
            if (flag) {
                break;
            }
        }
        if (flag) {
            return result;
        } else return new int[0];
    }
}

