package ByMyself.Java_Codingtest;

import java.util.Arrays;

public class Ct025_findmax {

    public static void main(String[] args) {


//        << 가장 큰 수 찾기 >>
//        정수 배열 array가 매개변수로 주어질 때,
//        가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

        /*

         입출력  예
         array	result
     [1, 8, 3]	[8, 1]
[9, 10, 11, 8]	[11, 2]

        */


        int[] array = {9,10,11,8};
        int[] answer = new int[2];
        int max = array[0];

        for(int i = 0; i<array.length;i++){
            if(array[i]>max){
                max = array[i];
                answer[0]=array[i];
                answer[1]=i;
            }

        }

        System.out.println(Arrays.toString(answer));

        Ct025_others ct25 = new Ct025_others();
        System.out.println(Arrays.toString(ct25.solution(array)));

    }
}

class Ct025_others {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        for(int i=0;i<array.length;i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}

