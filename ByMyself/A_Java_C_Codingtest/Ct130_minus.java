package ByMyself.A_Java_C_Codingtest;

import java.util.Arrays;

public class Ct130_minus {

    public static void main(String[] args) {

        int start = 10;
        int end = 3;

        int[] answer = new int[start-end+1];

        for(int i = 0;i<answer.length;i++){

            answer[i] = start;
            start--;

        }

        System.out.println(Arrays.toString(answer));

    }

}
