package com.drobot.day1.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

class SquareOfLastDigit {

    private int value;

    public SquareOfLastDigit(int value) {
        this.value = value;
    }

    public SquareOfLastDigit() {
        this.value = getValue();
    }

    int getResult() {
        return getLastDigitOfSquare(getLastDigitOfValue(value));
    }

    private int getValue() {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        boolean isCaught;

        do {
            try {
                isCaught = false;
                value = scanner.nextInt();
            } catch (InputMismatchException e) {
                isCaught = true;
                System.out.println("Enter an integer: ");
                scanner.nextLine();
            }
        } while (isCaught);

        scanner.close();

        return value;
    }



    private int getLastDigitOfValue(int value) {
        return Math.abs(value % 10);
    }

    private int getLastDigitOfSquare(int digit) {
        return ((digit * digit) % 10);
    }
}
