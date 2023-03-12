package study.book;

import java.util.Arrays;

public class Doit_07_Array {
    public static void main(String[] args) {




//        1. 배열이란
//        1) 자료를 순차적으로 관리하는 구조, 배열
//        2) 선언
//        3) 배열 사용
//        (1) 인덱스 연산자[]
//        (2) 배열 순서는 0번부터
//        4) 문자 저장 배열 만들기

        char[] alphabets = new char[26];
        char ch = 'A';
        for(int i = 0; i<alphabets.length; i++,ch++){  // 증감을 2개 이상 가능
            alphabets[i] = ch;
        }
        System.out.println(Arrays.toString(alphabets));

        







    }
}
