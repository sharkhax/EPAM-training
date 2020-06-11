package com.drobot.day1.service;

public class NumberService {

    /**
     * The digit, which does not obey the algorithm of determining a perfect number
     */
    private static final byte DOES_NOT_OBEY_DIGIT = 6;

    private static final int AMOUNT_OF_EVEN_NUMBERS = 2;

    public int calculateLastDigitSquare(double number) {
        int lastDigit = (int) Math.abs(number % 10);
        return (int) (Math.pow(lastDigit, 2) % 10);
    }

    public boolean areTwoNumbersEven(double... number) {
        int counter = 0;

        for (double v : number) {
            if (v % 2 == 0) {
                counter++;
                if (counter == AMOUNT_OF_EVEN_NUMBERS) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isNumberPerfect(long number) {
        if (number == DOES_NOT_OBEY_DIGIT) {
            return true;
        }

        long sum = 0;
        int k = 0;

        while (sum < number) {
            k++;
            sum += Math.pow((2 * k - 1), 3);
        }

        return (sum == number);
    }
}
