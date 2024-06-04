package com.company.problem1001To2000.problem1342.numberOfStepsToReduceANumberToZero;

import com.company.problem1001To2000.problem1342.numberOfStepsToReduceANumberToZero.P1342Solution;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class P1342SolutionTest {

    @Test
    void testNumberOfSteps() {
        P1342Solution solution = new P1342Solution();
        Assertions.assertThat(solution.numberOfSteps(14)).isEqualTo(6);
        Assertions.assertThat(solution.numberOfSteps(8)).isEqualTo(4);
        Assertions.assertThat(solution.numberOfSteps(123)).isEqualTo(12);
    }

}