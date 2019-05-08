package com.katas.frank;

import org.junit.Test;

import javax.imageio.ImageWriter;

import static org.junit.Assert.assertEquals;

public class FizzBuzzOutputTest {

    @Test(expected = RuntimeException.class)
    public void testWhenNumberIsNotPositiveIntegerThenAnExceptionIsThrown() {
        new FizzBuzzOutput(-1);
    }

    @Test
    public void testWhenNumberIsFiftheenThenCorrectOutputIsMet() {
        final int number = 15;
        FizzBuzzOutput fizzBuzzOutput = new FizzBuzzOutput(number);
        assertEquals(expectationNumberFiftheen, fizzBuzzOutput.getOutput());
    }

    private String expectationNumberFiftheen = "1\n" +
            "2\n" +
            "Fizz\n" +
            "4\n" +
            "Buzz\n" +
            "Fizz\n" +
            "7\n" +
            "8\n" +
            "Fizz\n" +
            "Buzz\n" +
            "11\n" +
            "Fizz\n" +
            "13\n" +
            "14\n" +
            "FizzBuzz\n";
}
