package com.company.problem0001To0100.problem0001.twoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P1SolutionTest {

    @Test
    void twoSum() {
        int[] nums = {2, 7, 11, 15};
        P1Solution solution = new P1Solution();
        Assertions.assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, 9));
        Assertions.assertArrayEquals(new int[]{-1, -1}, solution.twoSum(nums, 11));
    }

}