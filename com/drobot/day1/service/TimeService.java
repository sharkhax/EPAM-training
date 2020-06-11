package com.drobot.day1.service;

import com.drobot.day1.entity.TimeSet;

public class TimeService {

    private final int SECONDS_IN_A_MINUTE = 60;
    private final int MINUTES_IN_AN_HOUR = 60;
    private final int HOURS_IN_A_DAY = 24;
    private final int SECONDS_IN_A_DAY = SECONDS_IN_A_MINUTE
            * MINUTES_IN_AN_HOUR * HOURS_IN_A_DAY;
    private final int SECONDS_IN_AN_HOUR = MINUTES_IN_AN_HOUR
            * SECONDS_IN_A_MINUTE;

    public TimeSet createTimeSet(int initialSeconds) {
        int hours = calculateHours(initialSeconds);
        int minutes = calculateMinutes(initialSeconds);
        int seconds = calculateSeconds(initialSeconds);

        return new TimeSet(hours, minutes, seconds);
    }

    private int calculateHours(int initialSeconds) {
        return (initialSeconds / SECONDS_IN_AN_HOUR);
    }

    private int calculateMinutes(int initialSeconds) {
        int hours = calculateHours(initialSeconds);

        return ((initialSeconds - hours * SECONDS_IN_AN_HOUR)
                / SECONDS_IN_A_MINUTE);
    }

    private int calculateSeconds(int initialSeconds) {
        return (initialSeconds % SECONDS_IN_A_MINUTE);
    }
}
