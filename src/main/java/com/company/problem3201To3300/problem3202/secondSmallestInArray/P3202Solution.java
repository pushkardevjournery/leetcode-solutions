package com.company.problem3201To3300.problem3202.secondSmallestInArray;

public class P3202Solution {
    public static void main(String[] args) {
        P3202Solution solution = new P3202Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution.secondSmallestInArray(nums));
    }

    public int secondSmallestInArray(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Minimum 2 elements required");
        }

        int smallestNumber = Integer.MAX_VALUE;
        int secondSmallestNumber = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < smallestNumber) {
                secondSmallestNumber = smallestNumber;
                smallestNumber = num;
            } else if (num > smallestNumber && num < secondSmallestNumber) {
                secondSmallestNumber = num;
            }
        }

        if (secondSmallestNumber == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Array does not have a distinct second smallest element");
        }

        return secondSmallestNumber;
    }
}
