package test.drobot.day1.service;

import com.drobot.day1.service.NumberService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {

    NumberService numberService;

    @BeforeTest
    public void setUp() {
        numberService = new NumberService();
    }

    @Test
    public void calculateLastDigitSquare_True() {
        int number = 783;
        int actual = numberService.calculateLastDigitSquare(number);
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    public void calculateLastDigitSquare_False() {
        int number = 785;
        int actual = numberService.calculateLastDigitSquare(number);
        int expected = 9;

        assertNotEquals(actual, expected);
    }

    @Test
    public void areTwoNumbersEven_True() {
        double[] numbers = {4, 5.4, 23, 2.0};
        boolean condition = numberService.areTwoNumbersEven(numbers);

        assertTrue(condition);
    }

    @Test
    public void areTwoNumbersEven_False() {
        double[] numbers = {4, 5.4, 23, 3};
        boolean condition = numberService.areTwoNumbersEven(numbers);

        assertFalse(condition);
    }

    @Test
    public void isNumberPerfect_FirstCaseTrue() {
        long number = 6L;
        boolean condition = numberService.isNumberPerfect(number);

        assertTrue(condition);
    }

    @Test
    public void isNumberPerfect_FirstCaseFalse() {
        long number = 60000L;
        boolean condition = numberService.isNumberPerfect(number);

        assertFalse(condition);
    }

    @Test
    public void isNumberPerfect_SecondCaseTrue() {
        long number = 2305843008139952128L;
        boolean condition = numberService.isNumberPerfect(number);

        assertTrue(condition);
    }

    @Test
    public void isNumberPerfect_SecondCaseFalse() {
        long number = 2305843008121412412L;
        boolean condition = numberService.isNumberPerfect(number);

        assertFalse(condition);
    }

}
