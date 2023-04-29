package ByMyself.A_Java_C_Codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ct055_intReverse {

    public static void main(String[] args) {

//        << 자연수 뒤집어 배여롤 만들기 >>
//        자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
//        예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.


        /*

         입출력 예
             n	return
         12345	[5,4,3,2,1]

         */


        long n = 12345;
        int[] answer = new int[String.valueOf(n).split("").length];
        List<String> lst = new ArrayList<>(Arrays.asList(String.valueOf(n).split("")));
        int i = answer.length-1;
        for(String a : lst){
            answer[i] = Integer.parseInt(a);
            i--;
        }

        System.out.println(Arrays.toString(answer));


    }
}
