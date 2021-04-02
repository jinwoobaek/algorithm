package com.algorithm.study.level1;

import java.util.ArrayList;
import java.util.List;

/**
 * level 1 - 3진법 뒤집기
 * 월간 코드 챌린지 시즌1
 * 2021.04.02
 * 성공
 **/
public class ReverseBase3 {
    public int solution(int n) {
        int answer = 0;

        List<Integer> list = new ArrayList<Integer>();

        if (n < 3) {
            return n;
        }

        while (n >= 3) {
            list.add(n % 3);
            n /= 3;
        }

        int index = list.size();
        for (int i : list) {
            if (i == 0) {
                index--;
            } else {
                answer += (i * Math.pow(3, index--));
            }
        }

        answer += n;

        // Integer.parseInt(문자열, 진법)

        return answer;
    }
}
