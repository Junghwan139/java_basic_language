package Study.A_Java_C_Codingtest;

import java.util.*;

public class Ct049_hatevowel {

    public static void main(String[] args) {

//      << 모음제거 >>

//        영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
//        문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을
//        return하도록 solution 함수를 완성해주세요.


/*
             입출력 예
                my_string	result
                    "bus"	"bs"
        "nice to meet you"	"nc t mt y"

*/

        String my_string = "nice to meet you";

        List<String> lst = new ArrayList<>();
        lst.add("a");
        lst.add("e");
        lst.add("i");
        lst.add("o");
        lst.add("u");

        for (String a : lst) {
            my_string = my_string.replaceAll(a, "");
        }
    }
}

class Ct049_others {
    public String solution(String my_string) {
        String answer = "";

        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }
}