package ru.condition;

public class AlertDivByZero {
    public static void testingNumber(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("This is negative number.");
        }
    }

    public static void main(String[] args) {
        testingNumber(4);
        testingNumber(0);
        testingNumber(-5);
    }
}

