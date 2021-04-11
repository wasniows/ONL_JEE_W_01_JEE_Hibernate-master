package pl.coderslab.tdd.assertions;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {

        Calculator calculator = new Calculator();
        int expected = 7;
        int result = calculator.add(2, 5);
        assertEquals(expected, result);
    }

    @Test
    public void sub() {

        Calculator calculator = new Calculator();
        int expected = 3;
        int result = calculator.sub(9, 6);
        assertEquals(expected, result);
    }

    @Test
    public void multi() {

        Calculator calculator = new Calculator();
        int expected = 42;
        int result = calculator.multi(6, 7);
        assertEquals(expected, result);
    }

    @Test
    public void div() {

        Calculator calculator = new Calculator();
        int expected = 4;
        int result = calculator.div(24, 6);
        assertEquals(expected, result);
    }

    @Test
    public void grater() {

        Calculator calculator = new Calculator();
        boolean expected = true;
        boolean result = calculator.grater(7, 5);
        assertTrue(result);
    }

    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluatesExpression("1+2+3");
        assertEquals(6, sum);
    }
}