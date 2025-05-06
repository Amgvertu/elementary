package ru.condition;

public class Max {
    public static int max(int first, int second) {
        return first >= second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second), max(third, fourth));
    }

    public static void main(String[] args) {
        System.out.println(max(2, 5));
        System.out.println(max(12, 5, 7));
        System.out.println(max(3, 14, 7, 9));
    }
}
