package com.algorithm.study.level1;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ClawMachine cm = new ClawMachine();

        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        cm.solution(board, moves);
    }
}

