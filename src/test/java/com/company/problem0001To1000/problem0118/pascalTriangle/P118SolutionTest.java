package com.company.problem0001To1000.problem0118.pascalTriangle;

import com.company.problem0001To1000.problem0118.pascalTriangle.P118Solution;
import org.junit.jupiter.api.Test;

class P118SolutionTest {

    @Test
    void getRow() {
        P118Solution p118Solution = new P118Solution();
        p118Solution.generatePascalTriangle(0);
        p118Solution.generatePascalTriangle(5);
    }

}