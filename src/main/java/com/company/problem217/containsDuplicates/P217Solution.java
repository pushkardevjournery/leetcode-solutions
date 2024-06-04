package com.company.problem217;

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

    public boolean containsDuplicateUsingSortAndCompare(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicateUsingSortAndTwoPointer(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        while (left < right) {
            if (nums[left] == nums[right]) {
                return true;
            }
            left++;
            right++;
        }
        return false;
    }

}
