package ByMyself.C_Java_Codingtest;

import java.util.Arrays;

public class Ct031_changealph {
    public static void main(String[] args) {

//        << 대문자와 소문자 >>
//        문자열 my_string이 매개변수로 주어질 때,
//        대문자는 소문자로 소문자는 대문자로 변환한 문자열을
//        return하도록 solution 함수를 완성해주세요.

        /*

         입출력 예
     my_string	result
      "cccCCC"	"CCCccc"
  "abCdEfghIJ"	"ABcDeFGHij"

        */

        String my_string = "abCdEfghIJ";
        String answer;
        char [] ch = new char[my_string.length()];


//        Character.isUpperCase(char 변수) / isLowerCase(char 변수) 로 풀 것
//        소문자 : 97~122
//        대문자 : 65~90

        for(int i = 0;i<my_string.length();i++){
            ch[i]=my_string.charAt(i);
        }

        System.out.println(Arrays.toString(ch));

        for(int i = 0;i<ch.length;i++){
            if(ch[i]>=97){
                ch[i]= Character.toString(ch[i]).toUpperCase().charAt(0);
            }else{
                ch[i]= Character.toString(ch[i]).toLowerCase().charAt(0);
            }
        }

        System.out.println(Arrays.toString(ch));
        answer = String.join("",String.valueOf(ch));
        System.out.println(answer);


    }
}
