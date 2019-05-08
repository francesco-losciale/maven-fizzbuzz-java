package com.katas.frank;

public class IntegerEvaluator {

    public static String evaluate(int number) {
        if (isMultipleOf(number, 3) && isMultipleOf(number, 5)) {
            return "FizzBuzz";
        }
        if (isMultipleOf(number, 3)) {
            return "Fizz";
        }
        if (isMultipleOf(number, 5)) {
            return "Buzz";
        }
        return Integer.toString(number);
    }

    private static boolean isMultipleOf(int number, int multiplier) {
        return number % multiplier == 0;
    }
}
