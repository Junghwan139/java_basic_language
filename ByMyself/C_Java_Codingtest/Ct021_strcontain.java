package ByMyself.C_Java_Codingtest;

public class Ct021_strcontain {

    public static void main(String[] args) {

//        << 문자열안에 문자열 >>
//        문자열 str1, str2가 매개변수로 주어집니다.
//        str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

        /*


        입출력 예
                      str1	str2	result
  "ab6CDE443fgh22iJKlmn1o"	"6CD"	1
         "ppprrrogrammers"	"pppp"	2
                 "AbcAbcA"	"AAA"	2

        */


        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        int answer = 0;

        if(str1.contains(str2)){
            answer = 1;
        }else{
            answer = 2;
        }





    }
}
