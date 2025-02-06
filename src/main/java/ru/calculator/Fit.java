package ru.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = manWeight(height);
        double woman = womanWeight(height);
        System.out.println("Man " + height + " is " + man);
        System.out.println("Woman " + height + " is " + woman);
    }

}

