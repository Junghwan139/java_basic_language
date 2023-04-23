package ByMyself.A_Java_C_Codingtest;

public class Ct057_atobsum {
    public static void main(String[] args) {

//        << 두 정수 사이의 합 >>

//        두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수,
//        solution을 완성하세요.
//        예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

/*

        입출력 예
        a	b	return
        3	5	12
        3	3	3
        5	3	12

*/

        int a = 3;
        int b = 3;
        long answer = 0;

        int min = a < b ? a : b;
        int max = a > b ? a : b;

        for (int i = min; i <= max; i++) {
            answer += i;
        }

        System.out.println(answer);


    }
}

class Ct057_others {
    public long solution(int a, int b) {
        long answer = 0;
        for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) // for문에 삼항연산자
            answer += i;

        return answer;
    }
}