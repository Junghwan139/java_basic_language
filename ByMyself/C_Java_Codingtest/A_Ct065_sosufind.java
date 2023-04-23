package ByMyself.C_Java_Codingtest;

import java.util.HashMap;
import java.util.Map;

public class A_Ct065_sosufind {

    public static void main(String[] args) {

//        << 소수 찾기 >>

//        1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
//
//소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
//(1은 소수가 아닙니다.)


/*
        입출력 예
        n	result
        10	4
        5	3
*/
        // 1000000

        int n = 10;
        int answer = 0;

        int k = 100;
        Map<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        for(int i =1;i<=k;i++){
            count=0;
            for(int j = 1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
                if(count>=3){
                    break;
                }
            }
            mp.put(i,count);
        }

        System.out.println(mp);




/*


        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    if(count>=3){
                        break;
                    }
                }

            }
            if (count == 2) {
                answer++;
            }

            count = 0;


        }


*/



/*

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 2; i <= n; i++) {

            mp.put(i, 0);
        }

        int count = 0;
        for (int a : mp.keySet()) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    count++;
                    if(count>=3){
                        break;
                    }
                }

            }
            if (count == 2) {
                mp.put(a, 1);
            }
            count = 0;
        }

        for (int a : mp.keySet()) {
            if (mp.get(a) == 1) {
                answer += mp.get(a);
            }
        }

        System.out.println(answer);

*/
    }

}
