package Study.A_Java_B_Book.Doit_07;

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

//        5) 객체 배열 사용하기

//        Book[] library = new Book[5] → Book 클래스형으로 객체 배열 생성

//        6) 배열 복사하기
//        → ★ 메서드 : System.arraycopy(src, srcPos, dest, destPos, length)

        int[] array1 = {10,20, 30, 40, 50};
        int[] array2 = {1,2,3,4,5};

        System.out.println("최초 array2 : " + Arrays.toString(array2));
        System.arraycopy(array1,0,array2,1,4);
        System.out.println("array1에 있는 값을 array2로 복사한 후 : "+Arrays.toString(array2));

//        7) 향상된 for문과 배열
//        2. 다차원 배열
//        3. ArrayList 클래스 사용하기
        




    }
}
