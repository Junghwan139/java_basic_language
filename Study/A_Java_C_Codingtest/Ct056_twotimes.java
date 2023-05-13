package Study.A_Java_C_Codingtest;

public class Ct056_twotimes {
    public static void main(String[] args) {

//        << 제곱수 판별하기 >>

//        어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
//        정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를
//        return하도록 solution 함수를 완성해주세요.

/*
        입출력 예
        n	result
        144	1
        976	2

*/


        int n = 144;
        int answer = 0;

        for(int i = 1;i<n+1;i++){
            if(n%i==0 && i*i == n){
                answer = 1;
                break;
            }else{
                answer = 2;
            }
        }

        System.out.println(answer);


    }
}
