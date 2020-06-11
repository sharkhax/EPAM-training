package test.drobot.day1.service;

import com.drobot.day1.service.FunctionTableService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FunctionTableServiceTest {

    FunctionTableService functionTableService;

    @BeforeTest
    public void setUp() {
        functionTableService = new FunctionTableService();
    }

    @Test
    public void createTable_True() {
        try {
            double a = 1;
            double b = 2;
            double h = 0.5;
            String actual = functionTableService.createTable(a, b, h).toString();
            StringBuilder expected = new StringBuilder("x\tF(x)\n");
            expected.append("1.0\t1,557\n").append("1.5\t14,101\n");
            expected.append("2.0\t-2,185\n");

            assertEquals(actual, expected.toString());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void createTable_False() {
        try {
            double a = 1;
            double b = 3;
            double h = 0.5;
            String actual = functionTableService.createTable(a, b, h).toString();
            StringBuilder expected = new StringBuilder("x\tF(x)\n");
            expected.append("1.0\t1,557\n").append("1.5\t14,101\n");
            expected.append("2.0\t-2,185\n");

            assertNotEquals(actual, expected.toString());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test(expectedExceptions = Exception.class)
    public void createTable_Exception() throws Exception {
        double a = 2.0;
        double b = 1.0;
        double h = 0.5;

        functionTableService.createTable(a, b, h);
    }

}
