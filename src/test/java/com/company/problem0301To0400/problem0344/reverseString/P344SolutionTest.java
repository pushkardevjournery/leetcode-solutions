package com.company.problem0301To0400.problem0344.reverseString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P344SolutionTest {

    @Test
    void reverseString() {
        P344Solution solution = new P344Solution();
        Assertions.assertEquals("kciW nhoJ", solution.reverseString("John Wick".toCharArray()));
    }

}