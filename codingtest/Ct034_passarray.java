package codingtest;

import java.util.*;

public class Ct034_passarray {

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

        String A = "apple";
        String B = "elppa";
        int answer = 0;

        List<String> lst1 = new ArrayList<>(Arrays.asList(A.split("")));
        List<String> lst2 = new ArrayList<>(Arrays.asList(B.split("")));
        if(A.equals(B)){
            answer = 0;
        }else{

            for(int i = 1;i<A.length();i++){

                lst1.add(0,lst1.get(lst1.size()-1));
                lst1.remove(lst1.size()-1);

                if(lst1.equals(lst2)){
                    answer = i;
                    break;
                }

            }

            if(answer ==0){
                answer = -1;
            }

        }

        System.out.println(answer);



    }

}

class Ct034_others1 {
    public int solution(String A, String B) {
        String tempB = B.repeat(3);
        return tempB.indexOf(A);
    }
}

class Ct034_others2 {
    public int solution(String A, String B) {

        return (B+B).indexOf(A);
    }
}
