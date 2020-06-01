package com.drobot.day1.task7;

import java.util.Scanner;

import static java.lang.Character.isDigit;

class TwoPoints {

    private final String WRONG_FORMAT_MESSAGE = "Wrong format";

    private Scanner scanner = new Scanner(System.in);

    /**
     * Returns 1, if distance of the 1st point more than the 2nd's; otherwise - 2; 0 if equal.
     */
    byte getResult() {

        float distance1 = getDistance(getPoint());
        float distance2 = getDistance(getPoint());

        scanner.close();

        if (distance1 == distance2)
            return 0;
        else if (distance1 > distance2)
            return 1;
        else return 2;
    }

    private float[] getPoint() {
        String stringPoint;
        int spacePosition;

        do {
            stringPoint = inputString();
            spacePosition = isPointValid(stringPoint);
        } while (spacePosition == 0);


            System.out.println("The point has been added\n");
            return new float[]{Float.parseFloat(stringPoint.substring(0, spacePosition)),
                    Float.parseFloat(stringPoint.substring(spacePosition + 1))};
    }

    private int isPointValid(String stringPoint) {
            int spacePosition = 0;

            for (int i = 0; i < stringPoint.length(); i++) {
                if (stringPoint.charAt(i) == ' ') {
                    spacePosition = i;
                    break;
                }
                else if (!isDigit(stringPoint.charAt(i))) {
                    System.out.println(WRONG_FORMAT_MESSAGE);
                    return 0;
                }
            }

            for (int i = spacePosition + 1; i < stringPoint.length(); i++) {
                if (!isDigit(stringPoint.charAt(i))) {
                    System.out.println(WRONG_FORMAT_MESSAGE);
                    return 0;
                }
            }

            if (spacePosition == 0 || spacePosition == stringPoint.length() - 1) {
                System.out.println(WRONG_FORMAT_MESSAGE);
                return 0;
            } else return spacePosition;
    }

    private String inputString() {
        System.out.println("Enter a point (e.g. 100 -102): ");
        return scanner.nextLine();
    }

    private float getDistance(float[] point) {
        float distance = 0;

        for (float i : point) distance += Math.pow(i, 2);

        return (float) Math.pow(distance, 0.5);
    }
}
