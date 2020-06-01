package com.drobot.day1.task10;

import java.util.InputMismatchException;
import java.util.Scanner;

class FunctionTable {

    private Scanner scanner = new Scanner(System.in);

    void getTable() {
        double a, b, h;

        System.out.println("a: ");
        a = getDouble();

        System.out.println("b: ");
        b = getDouble();

        System.out.println("h: ");
        h = getDouble();

        System.out.println("x\t\tF(x)\n");
        for (double i = a; i <= b; i += h) {
            System.out.println(i + "\t\t" + getFunctionValue(i));
        }
    }

    private double getDouble() {
        double value = 0;
        boolean isCaught;

        do {
            try {
                isCaught = false;
                value = scanner.nextDouble();
            } catch (InputMismatchException e) {
                isCaught = true;
                System.out.println("Enter a double");
                scanner.nextLine();
            }
        } while (isCaught);

        return value;
    }

    private double getFunctionValue(double x) {
        return Math.tan(x);
    }
}
