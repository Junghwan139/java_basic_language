package ByMyself.C_Java_Codingtest;

public class Ct037_Couple {
    public static void main(String[] args) {

//        << 순서쌍의 개수 >>
//        순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
//        자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록
//        solution 함수를 완성해주세요.

        /*

         입출력 예
           n	result
          20	6
         100	9

        */

        int n = 100;
        int answer = 0;

        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                answer++;
            }
        }

        System.out.println(answer);


    }
}
