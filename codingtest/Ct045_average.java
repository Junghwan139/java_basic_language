package codingtest;

public class Ct045_average {
    public static void main(String[] args) {

//        << 평균 구하기 >>

//        정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

        /*
        입출력 예
        arr	return
   [1,2,3,4]	2.5
       [5,5]	5
                */

        int[] arr = {1,2,3,4};
        double answer = 0;

        double sum= 0;
        for(double a : arr){
            sum +=a;
        }
        answer = sum/arr.length;

        System.out.println(answer);



    }

}
