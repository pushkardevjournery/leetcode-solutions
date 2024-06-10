package com.company.problem3201To3300.problem3203.reverseArray;

import java.util.Arrays;

public class P3203Solution {

    public static void main(String[] args) {
        P3203Solution solution = new P3203Solution();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        solution.reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void reverseArray(int[] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
    }

}
