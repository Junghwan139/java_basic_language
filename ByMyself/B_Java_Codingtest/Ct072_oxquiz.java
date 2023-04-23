package ByMyself.B_Java_Codingtest;

import java.util.Arrays;

public class Ct072_oxquiz {

    public static void main(String[] args) {

//        << OX 퀴즈 >>

//        덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
//        수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.

/*

        입출력 예
                        quiz	result
["3 - 4 = -3", "5 + 6 = 11"]	["X", "O"]
["19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"]	["O", "O", "X", "O"]

*/



        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        String[] answer = new String[quiz.length];

        int[] spli = new int[quiz.length*3];

        int i = 0;
        for(String a : quiz){

            spli[i] = Integer.parseInt(a.split(" ")[0]);
            spli[i+1] = Integer.parseInt(a.split(" ")[2]);
            spli[i+2] = Integer.parseInt(a.split(" ")[4]);

            i +=3;

        }

        System.out.println(Arrays.toString(spli));

        i = 0;
        for(int j =0;j<spli.length;j+=3){
            if(quiz[i].split(" ")[1].equals("+")){
                if(spli[j]+spli[j+1]==spli[j+2]){
                    answer[i]="O";
                    i++;
                }else{
                    answer[i]="X";
                    i++;
                }
            }else{
                if(spli[j]-spli[j+1]==spli[j+2]){
                    answer[i]="O";
                    i++;
                }else{
                    answer[i]="X";
                    i++;
            }

        }
        }

        System.out.println(Arrays.toString(answer));




    }

}

class Ct071_others {
    public String[] solution(String[] quiz) {
        for(int i=0; i<quiz.length; i++){
            String[] text = quiz[i].split(" ");
            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
        }
        return quiz;
    }
}