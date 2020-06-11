package com.drobot.day1.validator;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class NumberValidator {

    private static final String INCORRECT_DATA_TYPE_MESSAGE = "Incorrect data type";

    public boolean isIntervalValid(double value, double minValue, double maxValue) {
        return (value >= minValue && value <= maxValue);
    }

    public double parseDoubleValue(String stringDouble) throws Exception {
        double value;

        try {
            value = parseDouble(stringDouble);
        } catch (NumberFormatException e) {
            throw new Exception(INCORRECT_DATA_TYPE_MESSAGE);
        }

        return value;
    }

    public int parseIntValue(String stringInt) throws Exception {
        int value;

        try {
            value = parseInt(stringInt);
        } catch (NumberFormatException e) {
            throw new Exception(INCORRECT_DATA_TYPE_MESSAGE);
        }

        return value;
    }

    public boolean isPositive(double value) {
        return (value > 0);
    }

}
