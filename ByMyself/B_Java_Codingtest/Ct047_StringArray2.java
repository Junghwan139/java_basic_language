package ByMyself.B_Java_Codingtest;

import java.util.Arrays;

public class Ct047_StringArray2 {
    public static void main(String[] args) {

//        << 문자열 정렬하기(2) >>

//        영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
//        my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을
//        return 하도록 solution 함수를 완성해보세요.

/*

        입출력 예
        my_string	result
        "Bcad"	"abcd"
        "heLLo"	"ehllo"
        "Python"	"hnopty"

*/


        String my_string = "Bcad";
        String answer = "";

        String[] arr = my_string.toLowerCase().split("");
        Arrays.sort(arr);
        answer = String.join("",arr);

        System.out.println(answer);

    }
}


class Ct047_others {
    public String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}

