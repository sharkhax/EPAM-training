package com.drobot.day1.service;

import java.util.Formatter;

public class FunctionTableService {

    public StringBuilder createTable(double a, double b, double h) throws Exception {
        StringBuilder sb = new StringBuilder("x\tF(x)\n");

        if (a > b) {
            throw new Exception("a > b");
        }

        for (double i = a; i <= b; i += h) {
            Formatter f = new Formatter();
            double functionValue = calculateFunctionValue(i);

            f.format("%.3f", functionValue);

            sb.append(i).append("\t").append(f);
            sb.append("\n");
        }

        return sb;
    }

    private double calculateFunctionValue(double x) {
        return Math.tan(x);
    }
}
