package ru.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min, ind, temp;
        for (int i = 0; i < data.length - 1; i++) {
            min = data[i];
            ind = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    ind = j;
                }
            }
            if (ind != i) {
                temp = data[ind];
                data[ind] = data[i];
                data[i] = temp;
            }
        }
        return data;
    }

}
