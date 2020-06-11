package com.drobot.day1.service;

import com.drobot.day1.entity.PointXY;

public class PointService {

    public int compareVectors(Double vector1, Double vector2) {
        return vector1.compareTo(vector2);
    }

    public double calculateVector(PointXY point) {
        double x = point.getX();
        double y = point.getY();

        return Math.hypot(x, y);
    }
}
