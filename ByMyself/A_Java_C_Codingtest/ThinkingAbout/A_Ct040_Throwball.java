package ByMyself.A_Java_C_Codingtest.ThinkingAbout;

import java.util.ArrayList;
import java.util.List;

public class A_Ct040_Throwball {

    public static void main(String[] args) {


//        << 공 던지기 >>

//        머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
//        공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
//        친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, k번째로 공을 던지는
//        사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.

        /*

        numbers	k	result
      [1, 2, 3, 4]	2	3
[1, 2, 3, 4, 5, 6]	5	3
         [1, 2, 3]	3	2

        */

        int[] numbers = {1,2,3};
        int k = 3;  //k*2-1 // 구하는 숫자 -number.length - 모자란 길이
        int answer = 0;
        int j = 0;
        List<Integer> lst = new ArrayList<>();
        for(int i = 0;i<numbers.length+k*2-2;i++){
            if(j<numbers.length){
                lst.add(numbers[j]);
                j++;
            }else{
                j =0;
            }
        }

        answer = lst.get(k*2-2);






    }

}
