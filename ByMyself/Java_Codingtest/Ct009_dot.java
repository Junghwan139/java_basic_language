package ByMyself.Java_Codingtest;

public class Ct009_dot {
    public static void main(String[] args) {

//        << 점의 위치 구하기 >>

//        사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다.
//        사분면은 아래와 같이 1부터 4까지 번호를매깁니다.

        /*

         x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
         x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
         x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
         x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.

        */

        int answer = 0;
        int[] dot = {2, 4};

        if(dot[0]>0 && dot[1]>0){
            answer = 1;
        }else if(dot[0]<0 && dot[1]>0){
            answer = 2;
        }else if(dot[0]>0 && dot[1]<0){
            answer = 4;
        }else{
            answer = 3;
        }







    }



}
