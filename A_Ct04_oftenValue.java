public class A_Ct04_oftenValue {

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

        int[] values = {1, 2, 3, 3, 3, 4};
        int[] values2 = new int[values.length];
        int count = 0;

        for (int i = 0; i < values.length; i++) {

            for (int j = 0; j < values.length; j++) {
                if (values[i] == values[j]) {
                    count++;
                }
            }
            values2[i] = count;
            count = 0;
            System.out.println(values2[i]);

        }





        } // 메인 함수
    } // 클래스
