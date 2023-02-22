package classforjava;

import java.util.*;

public class Cla06_Othervariables_S {
    public static void main(String[] args) {


//        자료형 : 원시자료 형(int, long, double, char 등) -> 값을 그대로 저장(주소도 있지만 값을 우선)
//        class형 : String, list, set -> 주소로 저장(값도 있지만 주소를 우선) * String의 경우 원시자료 형도 가능
//        자료형은 값비교 시 ==으로 비교, class형은 주소로 저장 되어 값비교 시 equals() 사용

//        저장 방식이 다름



//        1. String
//         1) String 함수
//           - indexOf
        String st1 = "Studying java";
        System.out.println(st1.indexOf("j"));
//           - contains()
//           - charAt()
//           - replaceAll()
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



















    }
}
