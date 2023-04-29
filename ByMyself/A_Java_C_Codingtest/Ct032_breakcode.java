package ByMyself.A_Java_C_Codingtest;

public class Ct032_breakcode {

    public static void main(String[] args) {

//        << 암호 해독 >>
//        군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
//        암호화된 문자열 cipher를 주고받습니다.
//        그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
//        문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록
//        solution 함수를 완성해주세요.

        /*

         입출력 예
                    cipher	code	result
"dfjardstddetckdaccccdegk"	4	"attack"
      "pfqallllabwaoclk"	2	"fallback"

        */


        String cipher = "pfqallllabwaoclk";
        int code = 2;
        String answer;
        String[] ci_arr = new String[cipher.length()];
        ci_arr = cipher.split("");

        StringBuffer stb = new StringBuffer();
        for(int i =0;i<ci_arr.length;i++){
            if(i%code==code-1){
                stb.append(ci_arr[i]);
            }

        }

        answer = stb.toString();




    }

}
