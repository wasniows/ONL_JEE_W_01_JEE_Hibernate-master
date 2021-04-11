package pl.coderslab.tdd.creation;

import org.junit.Test;

import static org.junit.Assert.*;

public class SampleTest {

    @Test
    public void sum(){

        Sample sample = new Sample();
        int expected =7;
        int result = sample.sum(2,5);
        assertEquals(expected, result);

    };

}