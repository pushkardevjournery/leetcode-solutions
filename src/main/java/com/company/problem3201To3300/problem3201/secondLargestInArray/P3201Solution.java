package com.company.problem3201To3300.problem3201.secondLargestInArray;

public class P3201Solution {

    public static void main(String[] args) {
        P3201Solution solution = new P3201Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution.secondLargestInArray(nums));
    }

    public int secondLargestInArray(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = num;
            } else if (num < largestNumber && num > secondLargestNumber) {
                secondLargestNumber = num;
            }
        }
        return secondLargestNumber;
    }

}
