package com.company.problem0001To1000.problem0412.fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class P412Solution {

    public static void main(String[] args) {
        P412Solution solution = new P412Solution();
        System.out.println(solution.fizzBuzz(20));
    }

    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzzList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzzList.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzzList.add("Buzz");
            } else {
                fizzBuzzList.add(String.valueOf(i));
            }
        }
        return fizzBuzzList;
    }

}
