package pl.coderslab.tdd.assertions;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxValueTest {

    @Test
    public void testLargest() {
        MaxValue maxValue = new MaxValue();
        int[] list = {2,4,9,5,10};
        int maxNumber = maxValue.largest(list);
        assertEquals(list[2], maxNumber);
    }

    @Test(expected = RuntimeException.class)
    public void testLargestRuntimeExepion() {
        MaxValue maxValue = new MaxValue();
        int[] list = {};
        maxValue.largest(list);
    }

}