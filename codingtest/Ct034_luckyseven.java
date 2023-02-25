package codingtest;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class Ct034_luckyseven {
    public static void main(String[] args) {

//        << 7의 개수 >>

//        머쓱이는 행운의 숫자 7을 가장 좋아합니다.
//        정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록
//        solution 함수를 완성해보세요.


        /*

         입출력 예
        array	result
  [7, 77, 17]	4
     [10, 29]	0

         */

        int[] array = {7, 77, 17};
        int answer = 0;
        String[] st = Arrays.toString(array).split("");
        for(String a : st){
            if(a.equals("7")){
                answer++;
            }
        }

        System.out.println(answer);






    }

}


class Ct034_others {
    public int solution(int[] array) {
        int answer = 0;
        for(int a : array){
            while(a != 0){
                if(a % 10 == 7){
                    answer++;
                }
                a /= 10;
            }
        }
        return answer;
    }
}