package com.company.problem118.pascalTriangle;

import org.junit.jupiter.api.Test;

class P118SolutionTest {

    @Test
    void getRow() {
        P118Solution p118Solution = new P118Solution();
        p118Solution.generatePascalTriangle(0);
        p118Solution.generatePascalTriangle(5);
    }

}