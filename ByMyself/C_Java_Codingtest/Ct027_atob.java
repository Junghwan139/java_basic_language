package ByMyself.C_Java_Codingtest;

import java.util.Arrays;

public class Ct027_atob {
    public static void main(String[] args) {

//        << A로 B 만들기 >>
//        문자열 before와 after가 매개변수로 주어질 때,
//        before의 순서를 바꾸어 after를 만들 수 있으면 1을,
//        만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

        String before = "allpe";
        String after = "apple";
        int answer = 0;
        String[] beforeChar = before.split("");
        String[] afterChar = after.split("");
        int[] array1 = new int[before.length()];
        int[] array2 = new int[after.length()];

        for(int i = 0;i< array1.length;i++){
            array1[i]=beforeChar[i].charAt(0);
        }
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        for(int i = 0;i<array2.length;i++){
            array2[i]=afterChar[i].charAt(0);
        }
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        boolean check = true;
        for(int i = 0;i<before.length();i++){
            if(array1[i]!=array2[i]){
                check = false;
            }
        }

        if (check == false){
            answer = 0;
        }else{
            answer = 1;
        }




    }
}

class Ct027_others {
    public int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 :0;
    }
}
