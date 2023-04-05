package codingtest;

public class Ct106_binSum {

    public static void main(String[] args) {


/*


<< 이진수 더하기  >>
문제 설명
이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
두 이진수의 합을 return하도록 solution 함수를 완성해주세요.

제한사항
return 값은 이진수를 의미하는 문자열입니다.
1 ≤ bin1, bin2의 길이 ≤ 10
bin1과 bin2는 0과 1로만 이루어져 있습니다.
bin1과 bin2는 "0"을 제외하고 0으로 시작하지 않습니다.
입출력 예
bin1	bin2	result
"10"	"11"	"101"
"1001"	"1111"	"11000"
입출력 예 설명
입출력 예 #1

10 + 11 = 101 이므로 "101" 을 return합니다.
입출력 예 #2

1001 + 1111 = 11000 이므로 "11000"을 return합니다.

*/

        String bin1 = "111";
        String bin2 = "111";
        String answer = "";

        int bin1_int = 0;
        int bin2_int = 0;
        int num = bin1.length();

        for(String a : bin1.split("")){

            bin1_int += Integer.parseInt(a)*Math.pow(2,num-1);
            num--;

        }

        num = bin2.length();
        for(String a : bin2.split("")){

            bin2_int += Integer.parseInt(a)*Math.pow(2,num-1);
            num--;

        }

        int total = bin1_int+bin2_int;

        while(total >= 1){

            answer += String.valueOf(total%2);
            total = total/2;

        }

        String[] answer2 = new String[answer.length()];
        num = answer.length()-1;
        for(String a : answer.split("")){
            answer2[num] = a;
            num--;

        }
        answer = "";

        // 문자열 뒤집는 메소드 확인

        for(String a : answer2){

            answer += a;

        }

        System.out.println(answer);







    }

}


class Ct106_Solution {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}
