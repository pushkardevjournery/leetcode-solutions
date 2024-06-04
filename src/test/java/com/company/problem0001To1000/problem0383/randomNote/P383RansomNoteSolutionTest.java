package com.company.problem0001To1000.problem0383.randomNote;

import com.company.problem0001To1000.problem0383.randomNote.P383RansomNoteSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P383RansomNoteSolutionTest {

    @Test
    void canConstruct() {
        P383RansomNoteSolution solution = new P383RansomNoteSolution();
        Assertions.assertEquals(false, solution.canConstruct("a", "b"));
        Assertions.assertEquals(false, solution.canConstruct("aa", "ab"));
        Assertions.assertEquals(true, solution.canConstruct("aa", "aab"));
    }

}