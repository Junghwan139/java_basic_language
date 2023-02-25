package codingtest;

import java.util.Arrays;

public class Ct033_sortarry {

    public static void main(String[] args) {

//        << 문자열 정렬하기 (1) >>
//        문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라
//        오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

        /*

         입출력 예
     my_string	result
     "hi12392"	[1, 2, 2, 3, 9]
   "p2o4i8gj2"	[2, 2, 4, 8]
      "abcde0"	[0]

        */


        String my_string = "hi12392";
        int [] answer = new int[my_string.replaceAll("[^0-9]","").length()];
        String[] my_string2 = my_string.replaceAll("[^0-9]","").split("");

        for(int i=0;i<answer.length;i++){
            answer[i] = Integer.parseInt(my_string2[i]);
        }
        Arrays.sort(answer);







    }
}
