package ru.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min, index;
        for (int i = 0; i < data.length; i++) {
            min = MinDiapason.findMin(data, i, data.length - 1);
            index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}
