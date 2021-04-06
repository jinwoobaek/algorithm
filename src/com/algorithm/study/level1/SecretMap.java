package com.algorithm.study.level1;

import java.util.ArrayList;
import java.util.List;

/**
 * level 1 - 비밀지도
 * 카카오 블라인드
 * 2021.04.06
 * 성공
 **/
public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String temp1;
        String temp2;
        String result;

        List<String> resultList = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            temp1 = Integer.toBinaryString(arr1[i]);
            temp2 = Integer.toBinaryString(arr2[i]);

            if (Integer.toBinaryString(arr1[i]).length() != n || Integer.toBinaryString(arr2[i]).length() != n) {
                while (temp1.length() < n) {
                    temp1 = "0" + temp1;
                }
                while (temp2.length() < n) {
                    temp2 = "0" + temp2;
                }
            }

            result = "";
            for (int j = 0; j < n; j++) {
                if (temp1.charAt(j) == '0' && temp2.charAt(j) == '0') {
                    result += " ";
                } else {
                    result += "#";
                }
            }

            resultList.add(result);
        }

        String[] answer = resultList.toArray(new String[resultList.size()]);
        return answer;
    }
}
