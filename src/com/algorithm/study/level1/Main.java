package com.algorithm.study.level1;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        NotFinishedPlayer nfp = new NotFinishedPlayer();

        nfp.solution(participant, completion);
    }
}

