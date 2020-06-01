package com.drobot.day1.task2;

import java.util.Scanner;

import static java.lang.Character.isDigit;

class NumberOfDaysInAMonth {

    private final short[] DAYS_ARRAY = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final String WRONG_FORMAT_MESSAGE = "Wrong format, retry: ";

    int getResult() {
        String stringDate = getDate();
        int month = getMonthFromStringDate(stringDate);

        if (month == 2 && isYearLeap(getYearFromStringDate(stringDate))) {
            return 29;
        } else return DAYS_ARRAY[month - 1];

    }

    private String getDate() {
        Scanner scanner = new Scanner(System.in);
        String stringDate;

        System.out.println("Enter the date in format \"mm year\": ");

        do {
            stringDate = scanner.nextLine();
        } while (!isDateCorrect(stringDate));

        scanner.close();

        return stringDate;
    }

    private int getMonthFromStringDate(String stingDate) {
        return Integer.parseInt(stingDate.substring(0, 2));
    }

    private int getYearFromStringDate(String stingDate) {
        return Integer.parseInt(stingDate.substring(3));
    }

    private boolean isYearLeap(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    private boolean isDateCorrect(String stringDate) {
        for (int i = 0; i < stringDate.length(); i++) {
            if (i == 2) {
                if (!(stringDate.charAt(i) == ' ')) {
                    System.out.println(WRONG_FORMAT_MESSAGE);
                    return false;
                }
                continue;
            }
            if (!isDigit(stringDate.charAt(i))) {
                System.out.println(WRONG_FORMAT_MESSAGE);
                return false;
            }
        }

        if (Integer.parseInt(stringDate.substring(0, 2)) > 0
                && Integer.parseInt(stringDate.substring(0, 2)) < 13) {
            return true;
        } else {
            System.out.println(WRONG_FORMAT_MESSAGE);
            return false;
        }
    }
}
