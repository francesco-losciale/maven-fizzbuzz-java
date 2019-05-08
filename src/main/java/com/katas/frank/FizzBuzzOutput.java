package com.katas.frank;

import java.io.PrintWriter;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.katas.frank.IntegerEvaluator.evaluate;

public class FizzBuzzOutput {
    private int upLimit;

    public FizzBuzzOutput(int upLimit) {
        this.upLimit = upLimit;
        checkValidInput(upLimit);
    }

    public String getOutput() {
        return IntStream.range(1, upLimit + 1)
                .mapToObj(number -> evaluate(number) + '\n')
                .collect(Collectors.joining());
    }

    private void checkValidInput(int upLimit) {
        if (upLimit < 0) {
            throw new RuntimeException("Only positive integer are accepted");
        }
    }
}
