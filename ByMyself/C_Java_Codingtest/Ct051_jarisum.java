package ByMyself.C_Java_Codingtest;

public class Ct051_jarisum {

    public static void main(String[] args) {

//        << 자릿수 더하기 >>

//        자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는
//        solution 함수를 만들어 주세요.
//        예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.


/*

        입출력 예
        N	answer
        123	6
        987	24

*/

        int n = 123;
        int answer = 0;

        String[] st = String.valueOf(n).split("");

        for(int i =0;i<st.length;i++){
            answer += Integer.parseInt(st[i]);
        }

        System.out.println(answer);



    }

}
