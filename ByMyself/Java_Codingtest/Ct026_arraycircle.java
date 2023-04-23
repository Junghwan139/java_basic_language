package ByMyself.Java_Codingtest;

import java.util.Arrays;

public class Ct026_arraycircle {

    public static void main(String[] args) {

//        << 배열 회전시키기 >>
//        정수가 담긴 배열 numbers와
//        문자열 direction가 매개변수로 주어집니다.
//        배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨
//        배열을 return하도록 solution 함수를 완성해주세요.

        /*
                 numbers	direction	result
                [1, 2, 3]	  "right"	[3, 1, 2]
[4, 455, 6, 4, -1, 45, 6]	  "left"	[455, 6, 4, -1, 45, 6, 4]

        */


        int[] numbers = {1, 2, 3};
        String direction = "right";
        int temp = 0;

        if (direction.equals("left")) {
            for (int i = 0; i < numbers.length - 1; i++) {
                temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        } else {
            for (int i =numbers.length-1; i >0 ; i--) {
                temp = numbers[i];
                numbers[i] = numbers[i-1];
                numbers[i-1] = temp;
            }


            System.out.println(Arrays.toString(numbers));

        }
    }
}