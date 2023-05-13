package Study.A_Java_C_Codingtest;

public class Ct028_indexchange {
    public static void main(String[] args) {


//        << 인덱스 바꾸기 >>

//        문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
//        my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를
//        바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.

        /*

            입출력 예
       my_string	num1	num2	result
         "hello"	   1	   2	"hlelo"
    "I love you"	   3	   6	"I l veoyou"

        */


        String my_stirng = "hello";
        int num1 = 1;
        int num2 = 2;
        String  answer;
        String temp;
        String[] divch = my_stirng.split("");
        temp = divch[num1];
        divch[num1] = divch[num2];
        divch[num2] = temp;
        answer = String.join("",divch);
        System.out.println(answer);








    }
}
