package pl.coderslab.tdd.assertions;

import com.sun.nio.sctp.IllegalUnbindException;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    @Test
    public void testCalculatorAdd() {

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int expected = 5;
        int result = simpleCalculator.add(2,3);

        assertEquals(expected, result);

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnIllegalArgEx() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
      simpleCalculator.addPositve(0, 1);
    }
}