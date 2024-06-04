package com.company.problem1601To1700.problem01672.richestCustomerWealth;

public class P1672Solution {

    public static void main(String[] args) {
        P1672Solution solution = new P1672Solution();
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        //int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        //int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1,9,5}};
        System.out.println(solution.findRichestCustomerWealth(accounts));
    }

    public int findRichestCustomerWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int totalWealth = 0;
            for (int currentWealth : account) {
                totalWealth += currentWealth;
            }
            maxWealth = Math.max(maxWealth, totalWealth);
        }
        return maxWealth;
    }

}
