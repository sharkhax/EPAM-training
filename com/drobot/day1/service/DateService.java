package com.drobot.day1.service;

import java.time.Month;

public class DateService {

    public boolean isYearLeap(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    public int getDaysOfMonth(int intMonth, boolean isYearLeap) {
        Month month = Month.of(intMonth);
        return month.length(isYearLeap);
    }
}
