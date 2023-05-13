package Study.A_Java_C_Codingtest;

import java.util.HashMap;
import java.util.Map;

public class Ct058_numsum {

    public static void main(String[] args) {

//        << 없는 숫자 더하기 >>

//        0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
//        numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return
//        하도록 solution 함수를 완성해주세요.

/*

                          입출력 예
                        numbers	result
              [1,2,3,4,6,7,8,0]	14
                [5,8,4,0,6,7,9]	6

*/

        int[] numbers = {5, 8, 4, 0, 6, 7, 9};
        int answer = 0;

        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();


        for (int i = 0; i < 10; i++) {
            mp1.put(i, i);
        }

        for (int a : numbers) {
            mp2.put(a, a);
        }

        for (int a : mp1.keySet()) {
            if (!mp2.containsKey(a)) {
                answer += a;
            }
        }

        System.out.println(answer);


    }

}


class Ct058_others {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}