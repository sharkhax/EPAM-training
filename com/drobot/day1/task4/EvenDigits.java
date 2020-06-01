package com.drobot.day1.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

class EvenDigits {

    private final int DIGITS_AMOUNT = 4;

    boolean getResult() {
        return evenChecker(getDigits());
    }

    private int[] getDigits() {

        Scanner scanner = new Scanner(System.in);
        int[] digits = new int[DIGITS_AMOUNT];
        boolean isCaught;

        for(int i = 0; i < DIGITS_AMOUNT; i++)
        do {
            try {
                digits[i] = scanner.nextInt();
                isCaught = false;
            } catch (InputMismatchException e) {
                isCaught = true;
                System.out.println("Enter an integer: ");
                scanner.nextLine();
            }
        } while (isCaught);

        scanner.close();

        return digits;
    }

    private boolean evenChecker(int[] digits) {

        int k = 0;

        for(int i = 0; i < DIGITS_AMOUNT; i++) {
            if (digits[i] % 2 == 0 && digits[i] != 0) k++;
            if (k == 2) return true;
        }

        return false;
    }
}
