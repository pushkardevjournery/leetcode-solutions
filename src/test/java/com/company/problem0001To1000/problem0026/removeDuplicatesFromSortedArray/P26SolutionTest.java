package com.company.problem0001To1000.problem0026.removeDuplicatesFromSortedArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P26SolutionTest {

    @Test
    void removeDuplicates() {
        P26Solution solution = new P26Solution();
        Assertions.assertEquals(2, solution.removeDuplicates(new int[]{1, 1, 2}));
        Assertions.assertEquals(5, solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

}