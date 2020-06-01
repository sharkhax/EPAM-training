package com.drobot.day1.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

class AreaOfSquare {

    /**
     * Multiplier between square's side and radius of circle around the square.
     */
    private final float SQUARE_MULTIPLIER = (float) Math.pow(2, 0.5);

    float[] getResult() {

        float initialArea = getInitialArea();
        float anotherArea = getAnotherArea(initialArea);

        return new float[]{anotherArea, getAreasRatio(anotherArea, initialArea)};
    }

    private float getInitialArea() {

        Scanner scanner = new Scanner(System.in);
        float initialArea = 0;
        boolean isCaught;

        do {
            try {
                isCaught = false;
                initialArea = scanner.nextFloat();
            } catch (InputMismatchException e) {
                isCaught = true;
                System.out.println("Enter a double: ");
                scanner.nextLine();
            }
        } while (isCaught);

        scanner.close();

        return initialArea;
    }

    private float getAnotherArea(float initialArea) {
        return (float) (initialArea * Math.pow(SQUARE_MULTIPLIER, 2));
    }

    private float getAreasRatio(float initialArea, float anotherArea) {
        return initialArea / anotherArea;
    }
}
