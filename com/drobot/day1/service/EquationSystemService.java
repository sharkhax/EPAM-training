package com.drobot.day1.service;

public class EquationSystemService {

    private final static double FIRST_CONDITION_CONST = 3;
    private final static double SECOND_CONDITION_CONST = 3;

    public double solveSystem(double x) {
        double answer = 0;

        if (checkFirstCondition(x)) {
            answer = solveFirstFunction(x);
        } else if (checkSecondCondition(x)) {
            answer = solveSecondFunction(x);
        }

        return answer;
    }

    private boolean checkFirstCondition(double x) {
        return x >= FIRST_CONDITION_CONST;
    }

    private boolean checkSecondCondition(double x) {
        return x < SECOND_CONDITION_CONST;
    }

    private double solveFirstFunction(double x) {
        return (-Math.pow(x, 2) + 3 * x + 9);
    }

    private double solveSecondFunction(double x) {
        return (1 / (Math.pow(x, 3) - 6));
    }

}
