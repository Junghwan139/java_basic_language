package ByMyself.C_Java_Codingtest;

public class Ct075_yakso {

    public static void main(String[] args) {


//        << 약수의 개수와 덧셈 >>

//        두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서,
//        약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.


/*
        입출력 예
        left	right	result
        13	17	43
        24	27	52
*/

        int left = 13;
        int right = 17;
        int answer = 0;

        int count = 0;
        for(int i = left; i<right+1;i++){
            for(int j = 1;j<i+1;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count%2==0){
                answer += i;
            }else{
                answer -=i;
            }
            count = 0;
        }

        System.out.println(answer);











    }

}
