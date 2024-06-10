package com.company.problem1401To1500.problem1464.maxProductOfTwoElementsInArray;

public class P1464Solution {

    public static void main(String[] args) {
        P1464Solution solution = new P1464Solution();
        int[] nums = {1, 5, 4, 5};
        System.out.println(solution.maxProduct(nums));
    }

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = num;
            } else if (num > secondLargestNumber) {
                secondLargestNumber = num;
            }
        }

        return (largestNumber - 1) * (secondLargestNumber - 1);
    }

}
