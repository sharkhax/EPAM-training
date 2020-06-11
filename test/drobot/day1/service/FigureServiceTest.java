package test.drobot.day1.service;

import com.drobot.day1.service.FigureService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FigureServiceTest {

    private static final double DELTA = 0.001;

    FigureService figureService;

    @BeforeTest
    public void setUp() {
        figureService = new FigureService();
    }

    @Test
    public void calculateSquareSide_True() {
        double area = 121;
        double actual = figureService.calculateSquareSide(area);
        double expected = 11;

        assertEquals(actual, expected, DELTA);
    }

    @Test
    public void calculateSquareSide_False() {
        double area = 100;
        double actual = figureService.calculateSquareSide(area);
        double expected = 11;

        assertNotEquals(actual, expected, DELTA);
    }

    @Test
    public void calculateAreaRatio_True() {
        double area1 = 25;
        double area2 = 5;
        double actual = figureService.calculateAreaRatio(area1, area2);
        double expected = 5;

        assertEquals(actual, expected, DELTA);
    }

    @Test
    public void calculateAreaRatio_False() {
        double area1 = 5;
        double area2 = 25;
        double actual = figureService.calculateAreaRatio(area1, area2);
        double expected = 5;

        assertNotEquals(actual, expected, DELTA);
    }

    @Test
    public void calculateCircleLength_True() {
        double radius = 10;
        double actual = figureService.calculateCircleLength(radius);
        double expected = 62.831;

        assertEquals(actual, expected, DELTA);
    }

    @Test
    public void calculateCircleLength_False() {
        double radius = 100;
        double actual = figureService.calculateCircleLength(radius);
        double expected = 62.831;

        assertNotEquals(actual, expected, DELTA);
    }

    @Test
    public void calculateCircleArea_True() {
        double radius = 10;
        double actual = figureService.calculateCircleArea(radius);
        double expected = 314.159;

        assertEquals(actual, expected, DELTA);
    }

    @Test
    public void calculateCircleArea_False() {
        double radius = 100;
        double actual = figureService.calculateCircleArea(radius);
        double expected = 314.159;

        assertNotEquals(actual, expected, DELTA);
    }
}
