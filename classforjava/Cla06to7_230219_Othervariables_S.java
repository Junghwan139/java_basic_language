package classforjava;

import java.util.*;

public class Cla06to7_230219_Othervariables_S {
    public static void main(String[] args) {


//        자료형 : 원시자료 형(int, long, double, char 등) -> 값을 그대로 저장(주소도 있지만 값을 우선)
//        class형 : String, list, set -> 주소로 저장(값도 있지만 주소를 우선) * String의 경우 원시자료 형도 가능
//        자료형은 값비교 시 ==으로 비교, class형은 주소로 저장 되어 값비교 시 equals() 사용

//        저장 방식이 다름



//        1. String
//         1) String 함수
//           - 찾을 때 : indexOf  <<인덱스 int 리턴>>
        String st1 = "Studying java";
        System.out.println(st1.indexOf("j"));
//           - 확인 : contains() <<포함여부 boolean 리턴>>
//           - 꺼낼 때 : charAt() <<문자 값 char 리턴>>
//           - 바꿀 떄 : replaceAll() <<변환된 문자열 String 리턴>>
        System.out.println(st1.length());
        String [] st2 = new String [st1.length()];
        st2=st1.split("");
        System.out.println(Arrays.toString(st2));
        String st3 = String.join("",st2);
        System.out.println(st3);
        int count = 0;
        for(int i =0;i<st1.length();i++){
            if(st1.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);

//           - 자를 떄 : substring(a, b) <<변환된 문자열 String 리턴>>
        String st4 = st1.substring(1,4);
        System.out.println(st4);

//           - 바꿀 때 : toUpperCase(), toLowercase() <<변환된 문자열 String 리턴>>
        String st5 = st1.toUpperCase();
        System.out.println(st5);

//           - 자를 때 : split(" ") <<변환된 문자열 String 리턴>>
//           - 합칠 떄 : +, StringBuffer(사용), StringBuilder, join(사용) <<변환된 문자열 String 리턴>>
        StringBuffer stb = new StringBuffer();
        stb.append("aaa");
        stb.append(111);
        System.out.println("stb = "+stb);

        String [] st_arr = {"aa","bb","cc"};
        String st6 = String.join(" ",st_arr);
        System.out.println(st6);

//           - 정리 : Trim, Strip(사용)
//           * 공백체크 : isEmpty(), isBlank()









    }
}
