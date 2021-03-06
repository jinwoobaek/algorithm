package com.algorithm.study.programmers.level1;

import java.util.ArrayList;
import java.util.List;

/**
 * level 1 - 크레인 인형뽑기 게임
 * 카카오 개발자 겨울 인턴십
 * 2021.04.01
 * 성공
 **/
public class ClawMachine {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        List<Integer> temp = new ArrayList<Integer>();

        for (int i : moves) {
            for (int row = 0; row < board.length; row++) {
                if (board[row][i - 1] != 0) {
                    if (!temp.isEmpty() && temp.get(temp.size() - 1).equals(board[row][i - 1])) {
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
