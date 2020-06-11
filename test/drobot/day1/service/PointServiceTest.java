package test.drobot.day1.service;

import com.drobot.day1.entity.PointXY;
import com.drobot.day1.service.PointService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointServiceTest {

    private static final double DELTA = 0.001;
    PointService pointService;

    @BeforeTest
    public void setUp() {
        pointService = new PointService();
    }

    @Test
    public void compareVectors_MoreTrue() {
        double vector1 = 124.142;
        double vector2 = 56.23;
        int actual = pointService.compareVectors(vector1, vector2);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void compareVectors_MoreFalse() {
        double vector1 = 56.23;
        double vector2 = 124.142;
        int actual = pointService.compareVectors(vector1, vector2);
        int expected = 1;

        assertNotEquals(actual, expected);
    }

    @Test
    public void compareVectors_EqualTrue() {
        double vector1 = 56.23;
        int actual = pointService.compareVectors(vector1, vector1);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void compareVectors_EqualFalse() {
        double vector1 = 124.142;
        double vector2 = 56.23;
        int actual = pointService.compareVectors(vector1, vector2);
        int expected = 0;

        assertNotEquals(actual, expected);
    }

    @Test
    public void compareVectors_LessTrue() {
        double vector1 = 56.23;
        double vector2 = 124.142;
        int actual = pointService.compareVectors(vector1, vector2);
        int expected = -1;

        assertEquals(actual, expected);
    }

    @Test
    public void compareVectors_LessFalse() {
        double vector1 = 124.142;
        double vector2 = 56.23;
        int actual = pointService.compareVectors(vector1, vector2);
        int expected = -1;

        assertNotEquals(actual, expected);
    }

    @Test
    public void calculateVector_True() {
        double x = 6;
        double y = 8;
        PointXY pointXY = new PointXY(x, y);
        double actual = pointService.calculateVector(pointXY);
        double expected = 10;

        assertEquals(actual, expected, DELTA);
    }

    @Test
    public void calculateVector_False() {
        double x = 6;
        double y = 5;
        PointXY pointXY = new PointXY(x, y);
        double actual = pointService.calculateVector(pointXY);
        double expected = 10;

        assertNotEquals(actual, expected, DELTA);
    }
}
