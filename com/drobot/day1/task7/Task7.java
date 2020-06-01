package com.drobot.day1.task7;

public class Task7 {
    public static void main(String[] args) {

        TwoPoints twoPoints = new TwoPoints();
        byte result = twoPoints.getResult();

        if (result == 0) System.out.println("Equal");
        else System.out.println(result + " is more");
    }
}
