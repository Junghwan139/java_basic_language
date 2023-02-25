package codingtest;

public class Ct019_hiddennumbersum {

    public static void main(String[] args) {

//        <<숨어있는 숫자의 덧셈(1)

//        문자열 my_string이 매개변수로 주어집니다.
//        my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

        /*
            입출력   예
        my_string	result
  "aAb1B2cC34oOp"	10
    "1a2b3c4d123"	16

        */

        String my_string = "aAb1B2cC34oOp";
        int answer =0;
        String removeNumber;
        removeNumber=my_string.replaceAll("[^0-9]","");
        String[] count = removeNumber.split("");
        for(int i= 0;i<removeNumber.length();i++){
            answer+=Integer.parseInt(count[i]);  //Integer.parseInt(스트링) String → int
        }
        System.out.println(answer);

        Ct019_other ct19 = new Ct019_other();
        System.out.println(ct19.solution(my_string));



    }

}


class Ct019_other {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]","");

        for(char ch : str.toCharArray()) {
            answer += Character.getNumericValue(ch);
        }

        return answer;
    }
}

