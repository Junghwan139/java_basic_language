package Study.A_Java_C_Codingtest;

public class Ct030_bacnum {
    public static void main(String[] args) {

//        << 세균 증식 >>
//        어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
//        처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때
//        t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.

        /*

        입출력 예
         box	n	result
   [1, 1, 1]	1	1
  [10, 8, 6]	3	12

        */

        int n = 2;
        int t = 10;
        int answer = 0;
//        처음 : 2
//        1시간 후 : 2*2 = 4
//        2시간 후 : 2*2*2 = 8
//        3시간 후 : 2*2*2*2 = 16
//        4시간 후 : 2*2*2*2*2 = 32

        for(int i = 1; i<=t;i++){
            n *=2;
        }

        System.out.println(n);


    }
}
