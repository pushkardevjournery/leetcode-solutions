package com.company.problem217.containsDuplicates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P217SolutionTest {

    @Test
    void containsDuplicate() {
        P217Solution solution = new P217Solution();
        Assertions.assertTrue(solution.containsDuplicateUsingHashMap(new int[]{1, 2, 3, 4, 1}));
        Assertions.assertTrue(solution.containsDuplicateUsingHashSet(new int[]{1, 2, 3, 4, 1}));
        Assertions.assertTrue(solution.containsDuplicateUsingSortAndCompare(new int[]{1, 2, 3, 4, 1}));
        Assertions.assertTrue(solution.containsDuplicateUsingSortAndTwoPointer(new int[]{1, 2, 3, 4, 1}));

        Assertions.assertFalse(solution.containsDuplicateUsingHashMap(new int[]{1, 2, 3, 4}));
        Assertions.assertFalse(solution.containsDuplicateUsingHashSet(new int[]{1, 2, 3, 4}));
        Assertions.assertFalse(solution.containsDuplicateUsingSortAndCompare(new int[]{1, 2, 3, 4}));
        Assertions.assertFalse(solution.containsDuplicateUsingSortAndTwoPointer(new int[]{1, 2, 3, 4}));
    }

}