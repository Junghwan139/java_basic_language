package study.webseach;

import java.util.Arrays;

public class A_ChangeType {
    public static void main(String[] args) {

//        1. String to char

//        (1) charAt() : << String 변수.charAt(위치) >> 스트링을 한자씩 잘라서 char타입으로 반환
//        (2) toCharArray() : << String 변수.CharArray() >>
        String st7 = "hello";
        char[] arraychar = st7.toCharArray();
        System.out.println(Arrays.toString(arraychar));

//        2. String to int

//        (1) Integer.parseInt() : << Integer.parseInt(String 변수) >> "숫자"로 되어 있는 String을 ""을 벗겨낸 int 숫자로 반환
        String st1 = "25";
        int num1;
        char ch2 ='e';
        num1 = Integer.parseInt(st1);
        System.out.println(num1);
        num1 = ch2;
        System.out.println(num1);



//        3. char / int to String

//        (1) String.valueOf() : << String.valueOf(char or int 변수) >>
        char ch1 = 'a';
        int num2 = 200;
        String st2;
        String st3 = String.valueOf(ch1);
        String st4 = String.valueOf(num2);

//        (2) Integer.toString() : << Integer.toString(int 변수) >>
        String st5 = Integer.toString(num2);

//        (3) Character.toString() : << Integer.toString(Character 변수) >>

        String st6 = Character.toString(ch1);








    }
}
