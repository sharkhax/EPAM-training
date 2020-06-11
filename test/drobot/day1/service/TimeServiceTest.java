package test.drobot.day1.service;

import com.drobot.day1.entity.TimeSet;
import com.drobot.day1.service.TimeService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TimeServiceTest {

    TimeService timeService;

    @BeforeTest
    public void setUp() {
        timeService = new TimeService();
    }

    @Test
    public void createTimeSet_True() {
        int initialSeconds = 45234;
        TimeSet actual = timeService.createTimeSet(initialSeconds);
        TimeSet expected = new TimeSet(12, 33, 54);

        assertEquals(actual, expected);
    }

    @Test
    public void createTimeSet_False() {
        int initialSeconds = 45256;
        TimeSet actual = timeService.createTimeSet(initialSeconds);
        TimeSet expected = new TimeSet(12, 33, 54);

        assertNotEquals(actual, expected);
    }
}
