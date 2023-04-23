package ByMyself.C_Java_Codingtest;

import java.util.*;

public class Ct038_oddarray {

    public static void main(String[] args) {


//        << 특이한 정렬 >>

//        정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
//        이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
//        정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터
//        가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.

        /*

         입출력 예
           numlist	n	result
[1, 2, 3, 4, 5, 6]	4	[4, 5, 3, 6, 2, 1]
[10000,20,36,47,40,6,10,7000]	30	[36, 40, 20, 47, 10, 6, 7000, 10000]

        */


        int[] numlist = {10000, 20, 36, 47, 40, 6, 10, 7000};
        int n = 30;

        int[] answer = new int[numlist.length];

        int[][] answer_s = new int[numlist.length][2];

        for (int i = 0; i < numlist.length; i++) {

            answer_s[i][0] = Math.abs(numlist[i] - n);
            answer_s[i][1] = numlist[i];

        }

        int[][] temp = new int[1][2];
        for(int i =0;i<numlist.length;i++){
            for(int j = i+1;j<numlist.length;j++){

                if(answer_s[i][0]>answer_s[j][0]){

                    temp[0][0] = answer_s[i][0];
                    temp[0][1] = answer_s[i][1];

                    answer_s[i][0] = answer_s[j][0];
                    answer_s[i][1] = answer_s[j][1];

                    answer_s[j][0] = temp[0][0];
                    answer_s[j][1] = temp[0][1];

                }else if(answer_s[i][0]==answer_s[j][0]){
                    if(answer_s[i][1]<answer_s[j][1]){

                        temp[0][0] = answer_s[i][0];
                        temp[0][1] = answer_s[i][1];

                        answer_s[i][0] = answer_s[j][0];
                        answer_s[i][1] = answer_s[j][1];

                        answer_s[j][0] = temp[0][0];
                        answer_s[j][1] = temp[0][1];

                    }
                }


            }
        }



        for (int[] a : answer_s) {
            System.out.println(Arrays.toString(a));
        }

        for (int i = 0; i < numlist.length; i++) {

            answer[i] = answer_s[i][1];

        }

        System.out.println(Arrays.toString(answer));







    }
}
