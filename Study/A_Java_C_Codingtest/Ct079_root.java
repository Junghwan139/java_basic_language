package Study.A_Java_C_Codingtest;

public class Ct079_root {

    public static void main(String[] args) {

//        << 정수 제곱근 판별 >>

//        임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

        /*

        입출력 예
n	return
121	144
3	-1

*/

        long n = 3;
        long answer = 0;

        int n_in = (int)Math.sqrt(n);

        if(n_in==Math.sqrt(n)){
            answer = (long)((Math.sqrt(n)+1)*(Math.sqrt(n)+1));
        }else{
            answer = -1;
        }

        System.out.println(answer);





    }

}


class Ct079_others {
    public long solution(long n) {
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
    }
}
