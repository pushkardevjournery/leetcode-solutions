package com.company.problem26.removeDuplicatesFromSortedArray;

public class P26Solution {

    public static void main(String[] args) {
        P26Solution solution = new P26Solution();
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 5, 6, 6, 6, 6, 7};
        System.out.println(solution.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }


}
