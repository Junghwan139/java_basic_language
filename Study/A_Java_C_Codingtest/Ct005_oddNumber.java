package Study.A_Java_C_Codingtest;

public class Ct005_oddNumber {
    public static void main(String[] args) {

//        << 짝수는 싫어요 >>
//        정수 n이 매개변수로 주어질 때,
//        n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

        int n = 15;
        int l;
        int j =0;
        if(n%2==0){
            l = n/2;
        }else{
            l = n/2+1;
        }
        int answer[] = new int [l];
        for (int i = 1;i<=n;i++){
            if(i%2!=0){
                answer[j]=i;
                System.out.println(answer[j]);
                j++;

            }
        }

    }
}
