package ByMyself.A_Java_C_Codingtest;

import java.util.HashMap;
import java.util.Map;

public class Ct004_oftenValue {

    public static void main(String[] args) {

//        << 최빈값 구하기 >>

//        최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
//        정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
//        최빈값이 여러 개면 -1을 return 합니다.

/*        입출력 예 #1
                [1, 2, 3, 3, 3, 4]에서 1은 1개 2는 1개 3은 3개 4는 1개로 최빈값은 3입니다.
                입출력 예 #2
                [1, 1, 2, 2]에서 1은 2개 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을
                return 합니다.
                입출력 예 #3
                [1]에는 1만 있으므로 최빈값은 1입니다.  */

        int[] array = {0,0,0,1};
        int answer = 0;

        Map<Integer,Integer> mp = new HashMap<>();
        for (int a : array){
            if(mp.containsKey(a)){
                mp.put(a,mp.get(a)+1);
            }else{
                mp.put(a,1);
            }
        }
        System.out.println(mp);

        int maxkey = -1;
        int maxvalue = -1;
        int samekey = -1;

        for(int a : mp.keySet()){
            if(mp.get(a)>maxvalue){
                maxvalue = mp.get(a);
                maxkey =a;
            }else if(maxvalue==mp.get(a)){
                samekey = a;

            }
        }

        if(mp.get(maxkey)==mp.get(samekey)){
            answer = -1;
        }else{
            answer = maxkey;
        }

        System.out.println(answer);

        } // 메인 함수
    } // 클래스
