package Study.A_Java_C_Codingtest;

public class Ct029_findnum {
    public static void main(String[] args) {

//        << 숫자 찾기 >>
//        정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면
//        num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록
//        solution 함수를 완성해보세요.

        /*

         입출력 예
         num	k	result
       29183	1	3
      232443	4	4
      123456	7	-1

        */

        int num = 29183;
        int k = 1;
        int answer = 0;

        String[] ch = String.valueOf(num).split("");
        int[] num1 = new int[ch.length];
        num1[0] = Integer.parseInt(ch[0]);

        for(int i = 0;i<ch.length;i++){
            num1[i] = Integer.parseInt(ch[i]);
        }

        for(int i = 0;i<num1.length;i++){
            if(k==num1[i]){
                answer = i+1;
                break;
            }else{
                answer = -1;
            }
        }

        System.out.println(answer);

        Ct029_others ct29 = new Ct029_others();
        System.out.println(ct29.solution(num,k));

    }
}


class Ct029_others {
    public int solution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }
}