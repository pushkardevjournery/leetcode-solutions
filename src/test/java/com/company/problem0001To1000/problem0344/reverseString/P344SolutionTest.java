package com.company.problem0001To1000.problem0344.reverseString;

import com.company.problem0001To1000.problem0344.reverseString.P344Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P344SolutionTest {

    @Test
    void reverseString() {
        P344Solution solution = new P344Solution();
        Assertions.assertEquals("kciW nhoJ", solution.reverseString("John Wick".toCharArray()));
    }

}