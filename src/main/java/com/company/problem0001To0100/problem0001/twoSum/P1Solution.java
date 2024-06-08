package com.company.problem0001To0100.problem0001.twoSum;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class P1Solution {

    public static void main(String[] args) {
        P1Solution solution = new P1Solution();
        System.out.println(Arrays.toString(solution.twoSumUsingTwoForLoop(new int[]{2, 7, 11, 15}, 26)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 26)));
    }

    // O(n^2)
    public int[] twoSumUsingTwoForLoop(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if (map.containsKey(delta)) {
                return new int[]{map.get(delta), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }

}
