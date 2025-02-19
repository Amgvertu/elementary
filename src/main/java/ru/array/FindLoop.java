package ru.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            System.out.println(i);
            if (data[i] == el) {
                rst = i;
            }
        }
        return rst;
    }
}

