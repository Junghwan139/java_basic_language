package codingtest;

import java.util.Arrays;

public class A_Ct004_oftenValue {

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

        int[] values = {1,1,1, 2, 3, 3, 3, 4};
        Arrays.sort(values);
        int count = 0;
        int maxcount = 0;
        int maxnum = 0;
        for(int i = 0;i<values.length;i++){
            if(values[i]==values[i+1]){
                maxnum = values[i+1];
                count++;
                maxcount = count;
            }else{
                count = 0;

            }

        }


//        1 - 1개, 2 - 1개, 3 - 3개, 4 -1개




        } // 메인 함수
    } // 클래스
