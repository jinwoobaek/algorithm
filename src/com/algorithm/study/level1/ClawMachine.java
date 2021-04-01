package com.algorithm.study.level1;

import java.util.ArrayList;
import java.util.List;

public class ClawMachine {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        List<Integer> temp = new ArrayList<Integer>();

        for (int i : moves) {
            for (int row = 0; row < board.length; row++) {
                if (board[row][i - 1] != 0) {
                    if (temp.size() > 0 && temp.get(temp.size() - 1).equals(board[row][i - 1])) {
                        temp.remove(temp.size() - 1);
                        board[row][i - 1] = 0;
                        answer += 2;
                        break;
                    }
                    temp.add(board[row][i - 1]);
                    board[row][i - 1] = 0;
                    break;
                }
            }
        }

        temp.forEach(System.out::println);

        return answer;
    }
}
