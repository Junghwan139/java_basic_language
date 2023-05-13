package Study.A_Java_C_Codingtest;

public class Ct039_Stringarrybasic {

    public static void main(String[] args) {

//        << 문자열 다루기 기본 >>

//        문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수,
//        solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고
//        "1234"라면 True를 리턴하면 됩니다.

        /*

         입출력 예
            s	return
         "a234"	false
         "1234"	true

        */

//        기본문자열의 갯수, 숫제를 제외 했을때 문자열의 갯수 비교
//        기본 문자열과 숫자제거 문자열 비교

        String s = "1234";
        boolean answer = true;

        String s_re = s.replaceAll("[^0-9]","");
        if(s.length()==4||s.length()==6){
            if(s.equals(s_re)){
            }else{answer = false;}

        }else{answer = false;}


        System.out.println(answer);




    }

}

class Ct039_others {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }
}