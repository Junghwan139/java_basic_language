package codingtest;

import java.util.HashMap;
import java.util.Map;

public class Ct035_RockPaperScissor {
    public static void main(String[] args) {

//        << 가위 바위 보 >>

//        가위는 2 바위는 0 보는 5로 표현합니다.
//        가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
//        rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을
//        return하도록 solution 함수를 완성해보세요.

        /*

        입출력 예
         rsp	result
         "2"	"0"
       "205"	"052"

        */

        String rsp = "205";
        String answer ="";
        Map<String,String> mp = new HashMap<>();
        mp.put("2","0");
        mp.put("5","2");
        mp.put("0","5");
        String[] rep_arr = rsp.split("");
        for(String a : rep_arr){
            answer += mp.get(a);
        }

        System.out.println(answer);



    }
}
