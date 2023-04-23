package ByMyself.C_Java_Codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ct015_yaksoogoohagi {
    public static void main(String[] args) {

//        << 약수 구하기 >>
//        정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을
//        return하도록 solution 함수를 완성해주세요.

        /*

        입출력 예
           n	result
           24	[1, 2, 3, 4, 6, 8, 12, 24]
           29	[1, 29]

        */

//        << 내 풀이 >>

        int n = 24;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(count);
        int[] answer = new int[count];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[j] = i;
                j++;
            }
        }

        Ct015_other sl = new Ct015_other();
        System.out.println(Arrays.toString(sl.solution2(24)));;



    }
}

// 다른 사람의 풀이

class Ct015_other {
    int[] solution2(int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}