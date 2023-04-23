package ByMyself.A_Java_C_Codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ct067_divarray {

    public static void main(String[] args) {

//        << 나누어 떨어지는 숫자 배열 >>

//        array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수,
//        solution을 작성해주세요.
//        divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.


/*

        입출력 예
          arr	divisor	return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
      [3,2,6]	10	[-1]

*/


        int[] arr = {3,2,6};
        int divisor = 10;

        List<Integer> lst = new ArrayList<>();
        for(int a : arr){
            if(a%divisor==0){
                lst.add(a);
            }
        }

        lst.sort(Comparator.naturalOrder());

        int[] answer;

        if(lst.size()==0){
            answer= new int[1];
            answer[0] = -1;
        } else{
            answer = new int[lst.size()];
            for(int i=0;i<lst.size();i++){
                answer[i] = lst.get(i);
            }
        }

        System.out.println(Arrays.toString(answer));




    }

}
