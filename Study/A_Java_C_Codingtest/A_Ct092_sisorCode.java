package Study.A_Java_C_Codingtest;

import java.util.Arrays;

public class A_Ct092_sisorCode {

    public static void main(String[] args) {


/*

        시저 암호
문제 설명
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

제한 조건
공백은 아무리 밀어도 공백입니다.
s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
s의 길이는 8000이하입니다.
n은 1 이상, 25이하인 자연수입니다.
입출력 예
s	n	result
"AB"	1	"BC"
"z"	1	"a"
"a B z"	4	"e F d"

*/

        String s = "a B z";
        int n = 4;

        String[] s_arr = s.split("");
        for(int i = 0;i<s_arr.length;i++){
            if(s.charAt(i)=='z'){
                s_arr[i] = String.valueOf('a'+n-1).toString();
            }else if(s.charAt(i)=='Z'){
                s_arr[i] = String.valueOf('A'+n-1).toString();
            }else if(s.charAt(i)==' '){
                s_arr[i] = String.valueOf(' ').toString();

            }
              else{
                s_arr[i] = String.valueOf(s.charAt(i)+n).toString();
            }
        }

        System.out.println(Arrays.toString(s_arr));



    }
}
