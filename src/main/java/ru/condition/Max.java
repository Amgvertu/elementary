package ru.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(2, 5));
        System.out.println(max(4, 1));
        System.out.println(max(9, 9));
    }
}
