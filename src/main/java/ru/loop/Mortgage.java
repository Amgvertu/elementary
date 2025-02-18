package ru.loop;

public class Mortgage {
    public static double amountChange(double amount, double percent) {
        return (amount + amount * percent / 100);
    }

    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = amountChange(amount, percent) - salary;
            year++;
        }
        return year;
    }
}

