package com.company.problem344.reverseString;

import java.util.Arrays;

public class P344Solution {

    public static void main(String[] args) {
        P344Solution solution = new P344Solution();
        String name = "John Wick";
        char[] s = name.toCharArray();
        System.out.println(solution.reverseString(s));
    }

    public String reverseString(char[] s) {
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }
        return String.valueOf(s);
    }

}
