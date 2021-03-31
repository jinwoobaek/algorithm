package com.algorithm.study.level1;

import java.util.Arrays;

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
