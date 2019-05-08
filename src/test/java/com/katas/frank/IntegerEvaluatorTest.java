package com.katas.frank;

import org.junit.Test;

import static com.katas.frank.IntegerEvaluator.evaluate;
import static org.junit.Assert.assertEquals;

public class IntegerEvaluatorTest {

    @Test
    public void testWhenNumberIsMuplipleOfThreeThenReturnWordFizz() {
        int number = 6;
        assertEquals("Fizz", evaluate(number * 3));
    }

    @Test
    public void testWhenNumberIsNotMultipleOfThreeThenReturnNumber() {
        int number = 2;
        assertEquals(Integer.toString(number), evaluate(number));
    }
    
    @Test
    public void testWhenNumberIsMultipleOfFiveThenReturnWordBuzz() {
        int number = 5;
        assertEquals("Buzz", evaluate(number));
    }

    @Test
    public void testWhenNumberIsNotMultipleOfFiveThenReturnNumber() {
        int number = 4;
        assertEquals(Integer.toString(number), evaluate(number));
    }

    @Test
    public void testWhenNumberIsMultipleOfThreeAndMultipleOfFiveThenReturnFizzBuzzWord() {
        int number = 15;
        assertEquals("FizzBuzz", evaluate(number));
    }

}
