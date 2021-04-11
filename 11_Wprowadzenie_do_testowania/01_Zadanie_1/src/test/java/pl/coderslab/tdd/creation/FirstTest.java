package pl.coderslab.tdd.creation;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstTest {

    @Test
    public void testConcatString() {
        First first = new First();
        String result = first.concatString("one","two");
        assertEquals("onetwo", result);
    }

    @Test
    public void testMultiply() {
        First first = new First();
        int result = first.multiply(2,3);
        assertEquals(6, result);
    }
}