package com.algorithm.study.programmers.level1;

/**
 * level 1 - 정수 제곱근 판별
 * 연습문제
 * 2021.03.31
 * 성공
 **/
public class SquareRoot {
    public long solution(long n) {
        long answer = Math.sqrt(n) % 1 == 0 ? (long) ((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1)) : -1;

        System.out.println(answer);
        return answer;
    }
}
