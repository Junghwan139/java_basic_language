package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ct048_ntimes {

    public static void main(String[] args) {

//        << n의 배수 고르기 >>

//        정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
//        numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록
//        solution 함수를 완성해주세요.


/*
        입출력 예
        n	numlist	result
        3	[4, 5, 6, 7, 8, 9, 10, 11, 12]	[6, 9, 12]
        5	[1, 9, 3, 10, 13, 5]	[10, 5]
        12	[2, 100, 120, 600, 12, 12]	[120, 600, 12, 12]

*/

        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        List<Integer> lst = new ArrayList<>();

        for(int i = 0;i<numlist.length;i++){

            lst.add(numlist[i]);

        }
        for(int i = 0;i<lst.size();i++){
            if(lst.get(i)%n!=0){
                lst.remove(i);
                i--;
            }
        }

        int[] answer = new int[lst.size()];

        for(int i = 0;i<answer.length;i++){
            answer[i] = lst.get(i);
        }




    }
}
