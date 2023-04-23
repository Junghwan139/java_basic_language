package ByMyself.A_Java_C_Codingtest;

public class Ct016_munjayeouldujibgi {
    public static void main(String[] args) {

//        << 문자열 뒤집기 >>
//        문자열 my_string이 매개변수로 주어집니다.
//        my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

        /*
             입출력  예
         my_string	return
           "jaron"	"noraj"
           "bread"	"daerb"

        */

//        << 내 풀이 >>

        String my_string = "jaron";
        String answer;
        String answer2;
        char[] reverse = new char[my_string.length()];
        for(int i = 0;i<my_string.length();i++){
            reverse[i]=my_string.charAt(my_string.length()-1-i);
        }
        //System.out.println(Arrays.toString(reverse));
        answer2 =String.join("",reverse.toString());
        System.out.println(answer2);
        answer = String.join("",String.valueOf(reverse));  // String.valueOf(reverse) char array 를 String으로 변환

        //System.out.println(answer);

        Ct016_other ct16 = new Ct016_other();
        String my_string2 = ct16.solution(my_string);
        System.out.println(my_string2);

    }
}

class Ct016_other {
     String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }
}