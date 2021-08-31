package com.algorithm.study.programmers.level1;

import java.util.Arrays;

/**
 * level 1 - 완주하지 못한 선수
 * 해시
 * 2021.03.31
 * 실패
 **/
public class NotFinishedPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                answer = participant[i];
                break;
            }
        }

        if (answer.equals("")) {
            answer = participant[completion.length];
        }

        return answer;
    }
}
