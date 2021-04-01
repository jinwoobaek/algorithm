package com.algorithm.study.level1;

public class Main {

    public static void main(String[] args) {
        // write your code here

        GymSuit gs = new GymSuit();

        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        gs.solution(n, lost, reserve);
    }
}

