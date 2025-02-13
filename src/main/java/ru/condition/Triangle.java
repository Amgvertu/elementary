package ru.condition;

public class Triangle {

    public static boolean checkSum(double ab, double ac, double bc) {
        return (ab + ac) > bc;
    }

    public static boolean exist(double ab, double ac, double bc) {
        return checkSum(ab, ac, bc) && checkSum(ac, bc, ab) && checkSum(bc, ab, ac);
    }

    public static void main(String[] args) {
        System.out.println(exist(3, 3, 6));
        System.out.println(exist(4, 3, 6));

    }
}

