package com.company.problem0301To0400.problem0383.randomNote;

import java.util.LinkedHashMap;
import java.util.Map;

public class P383RansomNoteSolution {

    public static void main(String[] args) {
        P383RansomNoteSolution solution = new P383RansomNoteSolution();
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(solution.canConstruct(ransomNote, magazine));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomMap = new LinkedHashMap<>();
        Map<Character, Integer> magazineMap = new LinkedHashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            if (ransomMap.containsKey(ransomNote.charAt(i))) {
                ransomMap.put(ransomNote.charAt(i), ransomMap.get(ransomNote.charAt(i)) + 1);
            } else {
                ransomMap.put(ransomNote.charAt(i), 1);
            }
        }
        for (int i = 0; i < magazine.length(); i++) {
            if (magazineMap.containsKey(magazine.charAt(i))) {
                magazineMap.put(magazine.charAt(i), magazineMap.get(magazine.charAt(i)) + 1);
            } else {
                magazineMap.put(magazine.charAt(i), 1);
            }
        }
        // Loop through the values of ransomMap
        for (Map.Entry<Character, Integer> entry : ransomMap.entrySet()) {
            if (magazineMap.containsKey(entry.getKey())) {
                if (magazineMap.get(entry.getKey()) >= entry.getValue()) {
                    continue;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

}
