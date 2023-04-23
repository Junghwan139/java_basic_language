package ByMyself.A_Java_C_Codingtest;

import java.util.Arrays;
import java.util.Iterator;

public class A_Ct087_right {

    public static void main(String[] args) {

//        << 올바른 괄호 >>

/*

문제 설명
괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어

"()()" 또는 "(())()" 는 올바른 괄호입니다.
")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

제한사항
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
입출력 예
s	answer
"()()"	true
"(())()"	true
")()("	false
"(()("	false
입출력 예 설명
입출력 예 #1,2,3,4
문제의 예시와 같습니다.

*/



/*
        String s = "(())()";
        boolean answer = true;

        if(String.valueOf(s.charAt(0)).equals(")")||String.valueOf(s.charAt(s.length()-1)).equals("(")){
            answer = false;
        }

        */

        String s = "(())()";
        boolean answer = true;

        Iterator<String> it = Arrays.stream(s.split("")).iterator();
        String temp1 = "";
        String temp2 = "";
        while(it.hasNext()){
            temp1 = it.next();
            if(temp1.equals(")") && temp2.equals("(")){
                answer = false;
                break;
            }else{
                temp2 = temp1;
            }


        }

        System.out.println(answer);




    }

}
