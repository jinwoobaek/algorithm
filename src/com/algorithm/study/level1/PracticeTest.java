package com.algorithm.study.level1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * level 1 - 모의고사
 * 완전탐색
 * 2021.04.01
 * 성공
 **/
public class PracticeTest {
    public int[] solution(int[] answers) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);

        int[] firstCase = {1, 2, 3, 4, 5};
        int[] secondCase = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdCase = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == firstCase[i % firstCase.length]) {
                map.put(1, map.get(1) + 1);
            }

            if (answers[i] == secondCase[i % secondCase.length]) {
                map.put(2, map.get(2) + 1);
            }

            if (answers[i] == thirdCase[i % thirdCase.length]) {
                map.put(3, map.get(3) + 1);
            }
        }

        int max = map.entrySet()
                .stream()
                .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
                .get()
                .getValue();


        List listOfMax = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == max)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        int[] answer = new int[listOfMax.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(listOfMax.get(i).toString());
        }
        return answer;
    }
}
