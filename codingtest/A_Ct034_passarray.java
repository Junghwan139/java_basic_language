package codingtest;

import java.util.HashMap;
import java.util.Map;

public class A_Ct034_passarray {

    public static void main(String[] args) {

//        << 문자열 밀기 >>
//        문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는
//        맨 앞으로 이동시키면 "ohell"이 됩니다. 이것을 문자열을 민다고 정의한다면
//        문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는
//        최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution
//        함수를 완성해보세요.

        /*

       입출력 예
       A	B	    result
  "hello"	"ohell"	1
  "apple"	"elppa"	-1
   "atat"	"tata"	1
    "abc"	"abc"	0

        */

        String A = "abc";
        String B = "abc";
        int answer = 0;


        String[] a_str = A.split("");
        String[] b_str = B.split("");

        String a_join = "";
        String b_join = "";

        String temp = "";


        for(int i =0; i<A.length()-1;i++){

            a_join = String.join("", a_str);
           b_join = String.join("", b_str);;

           if(a_join != b_join){
               if(i!=A.length()-2){

                   for(int j =a_str.length-1;j>1;j--){
                       temp = a_str[j];
                       a_str[j] = a_str[j-1];
                       a_str[j-1]=temp;
                   }
               }else{
                   answer = -1;
               }

            } else{
               answer = i;
                break;
            }



        }

        System.out.println(answer);









    }

}
