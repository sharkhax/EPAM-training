package com.drobot.day1.service;

public class FigureService {

    public double calculateSquareSide(double squareArea) {
        return Math.pow(squareArea, 0.5);
    }

    public double calculateAreaRatio(double area1, double area2) {
        return area1 / area2;
    }

    public double calculateCircleLength(double radius) {
        return 2 * Math.PI * radius;
    }

    public double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
