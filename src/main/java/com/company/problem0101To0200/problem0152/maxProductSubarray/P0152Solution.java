package com.company.problem0101To0200.problem0152.maxProductSubarray;

public class P0152Solution {

    public static void main(String[] args) {
        P0152Solution solution = new P0152Solution();
        int[] nums = {2, 3, -2, 4};
        //int[] nums = {-2, 0, -1};
        System.out.println(solution.maxProduct(nums));
    }

    public int maxProduct(int[] nums) {
        int max_ending_here = nums[0];
        int min_ending_here = nums[0];
        int max_so_far = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = Math.max(Math.max(nums[i], nums[i] * max_ending_here), nums[i] * min_ending_here);
            min_ending_here = Math.min(Math.min(nums[i], nums[i] * max_ending_here), nums[i] * min_ending_here);
            max_ending_here = temp;
            max_so_far = Math.max(max_so_far, max_ending_here);
        }

        return max_so_far;
    }

}
