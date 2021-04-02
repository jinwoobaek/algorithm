package com.algorithm.study.level1;

public class Main {

    public static void main(String[] args) {
        // write your code here

        GymSuit gs = new GymSuit();

        int n = 3;
        int[] lost = {1, 2};
        int[] reserve = {2, 3};

        gs.solution(n, lost, reserve);
    }
}

