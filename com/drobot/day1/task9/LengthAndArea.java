package com.drobot.day1.task9;

import java.util.InputMismatchException;
import java.util.Scanner;

class LengthAndArea {

    private final double PI = 3.14;

    private Scanner scanner = new Scanner(System.in);

    double[] getResult() {
        double radius = getRadius();

        return new double[] {getLength(radius), getArea(radius)};
    }

    private double getRadius() {
        double radius = 0;
        boolean isCaught;

        do {
            try {
                isCaught = false;
                radius = scanner.nextDouble();
            } catch (InputMismatchException e) {
                isCaught = true;
                System.out.println("Enter a double");
                scanner.nextLine();
            }
        } while (isCaught);

        return radius;
    }

    private double getLength(double radius) {
        return 2 * PI * radius;
    }

    private double getArea(double radius) {
        return PI * radius * radius;
    }
}
