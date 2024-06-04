package com.company.problem118.pascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class P118Solution {

    public static void main(String[] args) {
        P118Solution solution = new P118Solution();
        System.out.println(solution.generatePascalTriangle(5));
    }

    public List<List<Integer>> generatePascalTriangle(int rows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (rows == 0) {
            return triangle;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < rows; i++) {
            List<Integer> previousRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }

            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle;
    }

}
