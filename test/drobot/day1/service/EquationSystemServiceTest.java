package test.drobot.day1.service;

import com.drobot.day1.service.EquationSystemService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EquationSystemServiceTest {

    private static final double DELTA = 0.001;

    EquationSystemService equationSystemService;

    @BeforeTest
    public void setUp() {
        equationSystemService = new EquationSystemService();
    }

    @Test
    public void checkFirstCondition_True() {
        double variable = 0;
        double actual = equationSystemService.solveSystem(variable);
        double expected = -1/6.;

        assertEquals(actual, expected, DELTA);
    }

    @Test
    public void checkFirstCondition_False() {
        double variable = 0;
        double actual = equationSystemService.solveSystem(variable);
        double expected = -4545;

        assertNotEquals(actual, expected, DELTA);
    }
}
