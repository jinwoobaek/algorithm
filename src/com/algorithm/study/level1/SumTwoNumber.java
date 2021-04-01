package com.algorithm.study.level1;

import java.util.Set;
import java.util.TreeSet;

/**
 * level 1 - 두 개 뽑아서 더하기
 * 2021.03.31
 * 실패
**/
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
