package com.drobot.day1.task8;

import java.util.InputMismatchException;
import java.util.Scanner;

class FunctionSolver {

    private Scanner scanner = new Scanner(System.in);

    double getResult() {
        double x = getX();

        if (x < 3) return solveFunction2(x);
        else return solveFunction1(x);
    }

    private double solveFunction1(double x) {
        return (-x * x + 3 * x + 9);
    }

    private double solveFunction2(double x) {
        return (1 / (Math.pow(x, 3) - 6));
    }

    private double getX() {
        double x = 0;
        boolean isCaught;

        do {
            try {
                isCaught = false;
                x = scanner.nextDouble();
            } catch (InputMismatchException e) {
                isCaught = true;
                System.out.println("Enter a double");
                scanner.nextLine();
            }
        } while (isCaught);

        return x;
    }
}
