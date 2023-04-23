package ByMyself.Java_Codingtest;

public class Ct052_oddoreven {

    public static void main(String[] args) {

//        << 짝수와 홀수 >>

//        정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수,
//        solution을 완성해주세요.



/*

        입출력 예
              num	return
                3	"Odd"
                4	"Even"

*/

        int num = 3;
        String answer = "";

        answer = num%2==0 ? "Even" : "Odd";

        System.out.println(answer);



    }

}
