package Study.A_Java_C_Codingtest;

import java.util.stream.IntStream;

public class Ct061_hapsung {
    public static void main(String[] args) {

//        << 합성수 찾기 >>

//        약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
//        자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution
//        함수를 완성해주세요.

        /*

        입출력 예
        n	result
        10	5
        15	8

            */

        int n = 15;
        int answer = 0;

        int count = 0;
        for(int i =1;i<=n;i++){
            count = 0;
            for(int j = 1;j<=i;j++){
                if(i%j ==0){
                    count++;
                }
            }
            if(count>2){
                answer++;
            }
        }

        System.out.println(answer);





    }
}


class Ct061_others {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();
    }
}