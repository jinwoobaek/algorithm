package com.algorithm.study.programmers.level1;

/**
 * level 1 - 키패드 누르기
 * 카카오 인턴십
 * 2021.09.01
 * 좌표로 치환해서
 **/
public class InputKeypad {
    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int leftPos = 10;
        int rightPos = 12;


        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                leftPos = number;
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                rightPos = number;
            } else {
                int leftDistance = getDistance(leftPos, number);
                int rightDistance = getDistance(rightPos, number);

                if (leftDistance > rightDistance) {
                    sb.append("R");
                    rightPos = number;
                } else if (rightDistance > leftDistance) {
                    sb.append("L");
                    leftPos = number;
                } else {
                    if (hand.equals("right")) {
                        sb.append("R");
                        rightPos = number;
                    } else {
                        sb.append("L");
                        leftPos = number;
                    }
                }
            }
        }
        return sb.toString();
    }


    public static int getDistance(int pos, int number) {
        // 숫자 0의 경우 11로 치환
        pos = (pos == 0) ? 11 : pos;
        number = (number == 0) ? 11 : number;

        int x = (pos - 1) / 3;
        int y = (pos - 1) % 3;
        int numberX = number / 3;
        int numberY = 1;

        return Math.abs(x - numberX) + Math.abs(y - numberY);
    }

    public static void main(String[] args) {
        InputKeypad solution = new InputKeypad();

        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution.solution(numbers, hand));
    }
}
