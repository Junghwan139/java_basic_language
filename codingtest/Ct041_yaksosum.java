package codingtest;

public class Ct041_yaksosum {

    public static void main(String[] args) {


//        << 약수의 합 >>
//        정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

        /*

        입출력 예
            n	return
           12	28
            5	6

        */


        int n = 12;
        int answer = 0;

        for(int i =1; i<n+1;i++){
            if(n%i==0){

                answer +=i;
            }
        }

        System.out.println(answer);



    }

}
