package ru.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        boolean resultDiv0 = number == 0;
        boolean resultNegative = number < 0;

        if (resultDiv0) {
            System.out.println("Could not div by 0.");
        }
        if (resultNegative) {
            System.out.println("This is negative number.");
        }

    }

    public static void possibleDivVar2(int number) {

        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("This is negative number.");
        }

    }

    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-5);
        possibleDivVar2(4);
        possibleDivVar2(0);
        possibleDivVar2(-5);
    }
}

