package com.drobot.day1.entity;

public class Square {

    private double squareSide;

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    public double getSquareSide() {
        return squareSide;
    }

    public void setSquareSide(double squareSide) {
        this.squareSide = squareSide;
    }

    public double calculateSquareArea() {
        return Math.pow(squareSide, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.squareSide, squareSide) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(squareSide);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("squareSide=").append(squareSide);
        sb.append('}');
        return sb.toString();
    }
}
