package com.company.problem0201To0300.problem0217.containsDuplicates;

import java.util.*;

public class P217Solution {

    public static void main(String[] args) {
        P217Solution solution = new P217Solution();
        int[] nums = {1, 2, 3, 4, 1};
        System.out.println(solution.containsDuplicateUsingHashMap(nums));
        System.out.println(solution.containsDuplicateUsingHashSet(nums));
        System.out.println(solution.containsDuplicateUsingSortAndCompare(nums));
        System.out.println(solution.containsDuplicateUsingSortAndTwoPointer(nums));
    }

    // O(n)
    public boolean containsDuplicateUsingHashMap(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    // O(n)
    public boolean containsDuplicateUsingHashSet(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    // O(nlog(n))
    public boolean containsDuplicateUsingSortAndCompare(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }

    // O(nlog(n))
    public boolean containsDuplicateUsingSortAndTwoPointer(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        while (right < nums.length) {
            if (nums[left] == nums[right]) {
                return true;
            }
            left++;
            right++;
        }
        return false;
    }

}
