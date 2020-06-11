package test.drobot.day1.service;

import com.drobot.day1.service.DateService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DateServiceTest {

    DateService dateService;

    @BeforeTest
    public void setUp() {
        dateService = new DateService();
    }

    @Test
    public void isYearLeap_True() {
        int year = 2000;
        boolean condition = dateService.isYearLeap(year);
        assertTrue(condition);
    }

    @Test
    public void isYearLeap_False() {
        int year = 2100;
        boolean condition = dateService.isYearLeap(year);
        assertFalse(condition);
    }

    @Test
    public void getDaysOfMonth_True() {
        int intMonth = 5;
        boolean isYearLeap = true;
        int actual = dateService.getDaysOfMonth(intMonth, isYearLeap);
        int expected = 31;

        assertEquals(actual, expected);
    }

    @Test
    public void getDaysOfMonth_False() {
        int intMonth = 5;
        boolean isYearLeap = true;
        int actual = dateService.getDaysOfMonth(intMonth, isYearLeap);
        int expected = 30;

        assertNotEquals(actual, expected);
    }

    @Test
    public void getDaysOfMonth_FebruaryLeap_True() {
        int intMonth = 2;
        boolean isYearLeap = true;
        int actual = dateService.getDaysOfMonth(intMonth, isYearLeap);
        int expected = 29;

        assertEquals(actual, expected);
    }

    @Test
    public void getDaysOfMonth_FebruaryLeap_False() {
        int intMonth = 2;
        boolean isYearLeap = true;
        int actual = dateService.getDaysOfMonth(intMonth, isYearLeap);
        int expected = 28;

        assertNotEquals(actual, expected);
    }

    @Test
    public void getDaysOfMonth_FebruaryIsNotLeap_True() {
        int intMonth = 2;
        boolean isYearLeap = false;
        int actual = dateService.getDaysOfMonth(intMonth, isYearLeap);
        int expected = 28;

        assertEquals(actual, expected);
    }

    @Test
    public void getDaysOfMonth_FebruaryIsNotLeap_False() {
        int intMonth = 2;
        boolean isYearLeap = false;
        int actual = dateService.getDaysOfMonth(intMonth, isYearLeap);
        int expected = 29;

        assertNotEquals(actual, expected);
    }
}
