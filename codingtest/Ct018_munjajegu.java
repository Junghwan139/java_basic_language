package codingtest;

public class Ct018_munjajegu {
    public static void main(String[] args) {

//        << 특정 문자 제거하기 >>

//        문자열 my_string과 문자 letter이 매개변수로 주어집니다.
//        my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

        /*

          입출력 예
      my_string	letter	result
       "abcdef"	   "f"	"abcde"
       "BCBdbe"	   "B"	"Cdbe"

        */

        String my_string = "abcdef";
        String letter = "f";
        String answer;
        answer=my_string.replaceAll(letter,"");
        System.out.println(answer);
    }
}
