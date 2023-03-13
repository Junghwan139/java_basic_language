package codingtest;

import java.util.Arrays;

public class Ct086_minmax {

    public static void main(String[] args) {

//        << 최댓값과 최솟값 >>

/*

문제 설명
문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수,
solution을 완성하세요.
예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

제한 조건
s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.

입출력 예
s	return
"1 2 3 4"	"1 4"
"-1 -2 -3 -4"	"-4 -1"
"-1 -1"	"-1 -1"

*/

        String s = "1 2 3 4";
        String answer = "";

        String[] s_arr = s.split(" ");
        int[] s_int = new int[s_arr.length];

        for(int i = 0;i<s_int.length;i++){
            s_int[i] = Integer.parseInt(s_arr[i]);

        }

        answer =String.valueOf(Arrays.stream(s_int).min().getAsInt())+String.valueOf(Arrays.stream(s_int).max().getAsInt());
        System.out.println(answer);



    }

}
