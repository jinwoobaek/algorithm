package com.algorithm.study.level1;

import java.util.Set;
import java.util.TreeSet;

public class SumTwoNumber {
    public int[] solution(int[] numbers) {
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                treeSet.add(numbers[i] + numbers[j]);
            }
        }

        return treeSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
