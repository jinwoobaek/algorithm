package com.algorithm.study.level1;

public class SquareRoot {
    public long solution(long n) {
        long answer = Math.sqrt(n) % 1 == 0 ? (long) ((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1)) : -1;

        System.out.println(answer);
        return answer;
    }
}
