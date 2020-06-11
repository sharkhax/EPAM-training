package com.drobot.day1.entity;

public class TimeSet {

    private int hours, minutes, seconds;

    public TimeSet(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimeSet timeSet = (TimeSet) o;

        if (seconds != timeSet.seconds) return false;
        if (minutes != timeSet.minutes) return false;
        return hours == timeSet.hours;
    }

    @Override
    public int hashCode() {
        int result = seconds;
        result = 31 * result + minutes;
        result = 31 * result + hours;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TimeSet{");
        sb.append("hours=").append(hours);
        sb.append(", minutes=").append(minutes);
        sb.append(", seconds=").append(seconds);
        sb.append('}');
        return sb.toString();
    }
}
