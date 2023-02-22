package codingtest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ct23_strpepeat {
    public static void main(String[] args) {


//        << 문자 반복 출력하기 >>
//        문자열 my_string과 정수 n이 매개변수로 주어질 때,
//        my_string에 들어있는 각 문자를 n만큼 반복한 문자열을
//        return 하도록 solution 함수를 완성해보세요.
        /*

            입출력 예
       my_string	n	result
         "hello"	3	"hhheeellllllooo"




         */

        String my_string = "hello";
        int n = 3;
        String answer;
        String [] str1 = my_string.split("");
        String [] str2 = new String[str1.length];
        System.out.println(Arrays.toString(str1));
        for(int i = 0;i<str1.length;i++){
            str2[i] = str1[i].repeat(n);
        }

        answer = String.join("",str2);
        System.out.println(answer);

        Ct23_others ct23 = new Ct23_others();
        System.out.println(ct23.solution(my_string,n));


    }
}


class Ct23_others {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");
        for(String str : arr){
            for(int i=0; i<n; i++){
                answer += str;
            }
        }
        return answer;
    }
}