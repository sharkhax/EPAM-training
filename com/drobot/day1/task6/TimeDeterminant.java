package com.drobot.day1.task6;

import java.util.InputMismatchException;
import java.util.Scanner;

class TimeDeterminant {

    private final int SECONDS_IN_A_MINUTE = 60;
    private final int MINUTES_IN_AN_HOUR = 60;
    private final int HOURS_IN_A_DAY = 24;
    private final int SECONDS_IN_A_DAY = SECONDS_IN_A_MINUTE
            * MINUTES_IN_AN_HOUR * HOURS_IN_A_DAY;
    private final int SECONDS_IN_AN_HOUR = MINUTES_IN_AN_HOUR
            * SECONDS_IN_A_MINUTE;
    private final String WRONG_NUMBER_MESSAGE = "Enter an integer (0 - 86400): ";

    int[] getResult() {
        int initialSeconds = getInitialSeconds();

        return new int[]{getHours(initialSeconds),
                getMinutes(initialSeconds), getSeconds(initialSeconds)};
    }

    private int getInitialSeconds() {
        Scanner scanner = new Scanner(System.in);
        int initialSeconds = -1;
        boolean isCaught;

        while (true) {
            do {
                try {
                    isCaught = false;
                    initialSeconds = scanner.nextInt();
                } catch (InputMismatchException e) {
                    isCaught = true;
                    System.out.println(WRONG_NUMBER_MESSAGE);
                    scanner.nextLine();
                }
            } while (isCaught);

            if (initialSeconds >= 0 && initialSeconds <= SECONDS_IN_A_DAY) break;
            else System.out.println(WRONG_NUMBER_MESSAGE);
        }

        scanner.close();

        return initialSeconds;
    }

    private int getHours(int initialSeconds) {
        return (initialSeconds / SECONDS_IN_AN_HOUR);
    }

    private int getMinutes(int initialSeconds) {
        return ((initialSeconds - getHours(initialSeconds) * SECONDS_IN_AN_HOUR)
                / SECONDS_IN_A_MINUTE);
    }

    private int getSeconds(int initialSeconds) {
        return (initialSeconds % SECONDS_IN_A_MINUTE);
    }
}
