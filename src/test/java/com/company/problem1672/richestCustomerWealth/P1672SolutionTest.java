package com.company.problem1672.richestCustomerWealth;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class P1672SolutionTest {

    @Test
    void maxWealth() {
        P1672Solution solution = new P1672Solution();
        int[][] accounts1 = {{1, 2, 3}, {3, 2, 1}};
        int[][] accounts2 = {{1, 5}, {7, 3}, {3, 5}};
        int[][] accounts3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        Assertions.assertThat(solution.findRichestCustomerWealth(accounts1)).isEqualTo(6);
        Assertions.assertThat(solution.findRichestCustomerWealth(accounts2)).isEqualTo(10);
        Assertions.assertThat(solution.findRichestCustomerWealth(accounts3)).isEqualTo(17);
    }

}