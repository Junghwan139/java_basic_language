package Study.A_Java_C_Codingtest;

public class Ct003_mid {
    public static void main(String[] args) {

//        << 중앙값 구하기 >>
//        중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
//                예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때,
//        중앙값을 return 하도록 solution 함수를 완성해보세요.
//        array의 길이는 홀수입니다.
//        0 < array의 길이 < 100
//                -1,000 < array의 원소 < 1,000

/*        array	result
                [1, 2, 7, 10, 11]	7
                [9, -1, 0]	0*/


        int array[] = {3, 2, 1, 10, 11};
        int leng = array.length;
        int i;
        int j;
        int k;

        for (i = 0; i < leng; i++) {
            for (j = i + 1; j < leng; j++) {
                if (array[i] > array[j]) {
                    k = array[i];
                    array[i] = array[j];
                    array[j] = k;

                }
            }
        }
        int l=leng/2;
        System.out.println(array[l]);
        System.out.printf("[%d][%d][%d][%d][%d]",array[0],array[1],array[2],array[3],array[4]);



    }

}