package com.company.problem1342.numberOfStepsToReduceANumberToZero;

public class P1342Solution {

    public static void main(String[] args) {
        P1342Solution solution = new P1342Solution();
        System.out.println(solution.numberOfSteps(14));
    }

    public int numberOfSteps(int num) {
        int stepCounter = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num -= 1;
            }
            stepCounter++;
        }
        return stepCounter;
    }

}
