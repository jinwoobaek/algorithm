package com.algorithm.study.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * level 1 - 체육복
 * 탐욕법
 * 2021.04.02
 * 성공
 **/
public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());

        for (int value : new ArrayList<>(lostList)) {
            if (reserveList.contains(value)) {
                lostList.remove(lostList.indexOf(value));
                reserveList.remove(reserveList.indexOf(value));
            }
        }

        int[] scaleLost = new int[lostList.size()];

        for (int i = 0; i < scaleLost.length; i++) {
            scaleLost[i] = lostList.get(i);
        }

        for (int value : scaleLost) {

            if (reserveList.contains(value - 1)) {
                lostList.remove(lostList.indexOf(value));
                reserveList.remove(reserveList.indexOf(value - 1));
                continue;
            }

            if (reserveList.contains(value + 1)) {
                lostList.remove(lostList.indexOf(value));
                reserveList.remove(reserveList.indexOf(value + 1));
            }
        }
        return n - lostList.size();
    }
}
