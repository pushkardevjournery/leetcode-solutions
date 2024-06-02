package com.company.problem412.fizzBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class P412SolutionTest {

    @Test
    void fizzBuzz() {
        P412Solution solution = new P412Solution();
        List<String> expectedResultFor1 = List.of("1");
        List<String> expectedResultFor2 = Arrays.asList("1", "2");
        List<String> expectedResultFor3 = Arrays.asList("1", "2", "Fizz");
        List<String> expectedResultFor5 = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
        List<String> expectedResultFor15 = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
                "13", "14", "FizzBuzz");
        Assertions.assertEquals(expectedResultFor1, solution.fizzBuzz(1));
        Assertions.assertEquals(expectedResultFor2, solution.fizzBuzz(2));
        Assertions.assertEquals(expectedResultFor3, solution.fizzBuzz(3));
        Assertions.assertEquals(expectedResultFor5, solution.fizzBuzz(5));
        Assertions.assertEquals(expectedResultFor15, solution.fizzBuzz(15));
    }

}