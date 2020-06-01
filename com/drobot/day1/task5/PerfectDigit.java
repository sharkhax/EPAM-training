package com.drobot.day1.task5;

import java.util.InputMismatchException;
import java.util.Scanner;

class PerfectDigit {

    boolean getResult() {
        return isDigitPerfect(getDigit());
    }

    private long getDigit() {
        Scanner scanner = new Scanner(System.in);
        long digit = 0;
        boolean isCaught;

        do {
            try {
                isCaught = false;
                digit = scanner.nextLong();
            } catch (InputMismatchException e) {
                isCaught = true;
                System.out.println("Enter an integer: ");
                scanner.nextLine();
            }
        } while (isCaught);

        scanner.close();

        return digit;
    }

    private boolean isDigitPerfect(long digit) {
        long sum = 0;
        int k = 0;

        if (digit == 6) return true;

        while (sum < digit) {
            k++;
            sum += Math.pow( (2 * k - 1), 3);
        }

        return (sum == digit);
    }
}
