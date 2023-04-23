package ByMyself.C_Java_Codingtest;

import java.util.Arrays;

public class Ct017_beayeljalugi {
    public static void main(String[] args) {


//        << 배열 자르기 >>
//        정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
//        numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을
//        return 하도록 solution 함수를 완성해보세요.


        /*

        입출력 예
      numbers	num1	num2	result
[1, 2, 3, 4, 5]   	1	   3	[2, 3, 4]
      [1, 3, 5]	    1	   2	[3, 5]


        */

        int[] numbers = {1,2,3,4,5};
        int num1 = 1;
        int num2 = 3;
        int [] answer = new int[num2-num1+1];
        int j = 0;
        for(int i = num1;i<=num2;i++){
            answer[j] = numbers[i];
            j++;
        }
        System.out.println(Arrays.toString(answer));

        Ct017_other ct17 = new Ct017_other();
        System.out.println(Arrays.toString(ct17.solution(numbers,num1,num2)));

    }
}


class Ct017_other {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);

        //Arrays.coupyOfRange(배열, from, to) from부터 to까지 배열값 리턴
    }
}