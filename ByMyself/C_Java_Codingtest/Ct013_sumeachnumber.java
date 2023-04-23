package ByMyself.C_Java_Codingtest;

public class Ct013_sumeachnumber {
    public static void main(String[] args) {

//        << 자릿수 더하기 >>
//        정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
        /*

        입출력 예
        n	    result
        1234	10
        930211	16

        */

        int n = 1234;
        int answer = 0;

        for (int i = 0;i<n;){
            answer += n%10;
            System.out.println(answer);
            n /= 10;

        }
        System.out.println(answer);

//        answer += n%10;
//        n /= 10;
//        System.out.println(answer);
//        answer += n%10;
//        n /= 10;
//        System.out.println(answer);
//        answer += n%10;
//        n /= 10;
//        System.out.println(answer);
//        answer += n%10;
//        n /= 10;
//        System.out.println(answer);




    }

}
