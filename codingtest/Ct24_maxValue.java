package codingtest;

import java.util.Arrays;

public class Ct24_maxValue {
    public static void main(String[] args) {


//        << 최댓값 만들기 (1) >>
//        정수 배열 numbers가 매개변수로 주어집니다.
//        numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

        /*
                입출력   예
              numbers	result
      [1, 2, 3, 4, 5]	20
[0, 31, 24, 10, 1, 9]	744


        */

        int[] numbers = {1,2,3,4,5};
        Arrays.sort(numbers);
        int answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        System.out.println(answer);







    }

    }
