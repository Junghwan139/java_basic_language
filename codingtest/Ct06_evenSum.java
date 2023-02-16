package codingtest;

public class Ct06_evenSum {
    public static void main(String[] args) {

//        << 짝수의 합 >>
//        정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

        /*

        입출력 예
        n	result
        10	30
        4	6

         */

        int answer = 0;
        int n = 4;
        for(int i = 1;i<n+1;i++){
            if(i%2==0){
                answer+=i;
            }
        }
        System.out.println(answer);
    } // 메인함수
} // class
