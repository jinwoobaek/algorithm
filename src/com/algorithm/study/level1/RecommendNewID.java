package com.algorithm.study.level1;

/**
 * level 1 - 신규 아이디 추천
 * 카카오 블라인드 (정규표현식)
 * 2021.04.05
 * 실패
 **/
public class RecommendNewID {
    public String solution(String new_id) {
        // 1. 모두 소문자로 대체
        String answer = new_id.toLowerCase();

        // 2. '-', '_', '.', 'a-z', '0-9' 가 아니면('^') 공백으로 대체
        answer = answer.replaceAll("[^-_.a-z0-9]", "");

        // 3. 마침표('.')가 연속되면 하나로 치환
        answer = answer.replaceAll("[.]{2,}", ".");

        // 4. 마침표('.')가 처음이나 끝에 위치한다면 제거
        answer = answer.replaceAll("^[.]|[.]$", "");

        // 5. answer이 빈 문자열이라면, a 대입
        if (answer.equals("")) {
            answer += "a";
        }

        // 6. new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if (answer.length() >= 16) {
            // new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }

        // 7. 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length() - 1);
            }
        }

        System.out.println(answer);

        //bat.y.abcdefghi
        return answer;
    }
}
