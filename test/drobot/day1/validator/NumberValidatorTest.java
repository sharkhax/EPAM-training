package test.drobot.day1.validator;

import com.drobot.day1.validator.NumberValidator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberValidatorTest {

    NumberValidator numberValidator;

    @BeforeTest
    public void setUp() {
        numberValidator = new NumberValidator();
    }

    @Test
    public void isIntervalValid_True() {
        double value = 5.14;
        double minValue = 0;
        double maxValue = 57.12;
        boolean condition = numberValidator.isIntervalValid(value, minValue, maxValue);

        assertTrue(condition);
    }

    @Test
    public void isIntervalValid_False() {
        double value = 57.14;
        double minValue = 0;
        double maxValue = 57.12;
        boolean condition = numberValidator.isIntervalValid(value, minValue, maxValue);

        assertFalse(condition);
    }

    @Test
    public void parseDoubleValue_True() {
        try {
            String stringDouble = "77.320";
            double actual = numberValidator.parseDoubleValue(stringDouble);
            double expected = 77.32;

            assertEquals(actual, expected);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void parseDoubleValue_False() {
        try {
            String stringDouble = "77.3232";
            double actual = numberValidator.parseDoubleValue(stringDouble);
            double expected = 77.32;

            assertNotEquals(actual, expected);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void parseIntValue_True() {
        try {
            String stringInt = "77";
            int actual = numberValidator.parseIntValue(stringInt);
            int expected = 77;

            assertEquals(actual, expected);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void parseIntValue_False() {
        try {
            String stringInt = "77";
            int actual = numberValidator.parseIntValue(stringInt);
            int expected = 78;

            assertNotEquals(actual, expected);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = Exception.class)
    public void parseIntValue_Exception() throws Exception {
        String stringInt = "77.0";
        numberValidator.parseIntValue(stringInt);
    }

    @Test(expectedExceptions = Exception.class)
    public void parseDoubleValue_Exception() throws Exception {
        String stringInt = "hello";
        numberValidator.parseDoubleValue(stringInt);
    }

    @Test
    public void isPositive_True() {
        double value = 5;
        boolean condition = numberValidator.isPositive(value);

        assertTrue(condition);
    }

    @Test
    public void isPositive_False() {
        double value = -5;
        boolean condition = numberValidator.isPositive(value);

        assertFalse(condition);
    }
}
