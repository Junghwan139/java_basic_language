package codingtest;

public class Ct008_Splitpizza_1_2 {
    public static void main(String[] args) {

//        << 피자 나눠 먹기 (1) >>
//        머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
//        피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해
//        필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.

//        int n = 15;
//        int answer;
//
//        if(n%7==0){
//            answer = n/7;
//        }else{
//            answer = n/7+1;
//        }

//        << 피자 나눠 먹기 (2) >>
//      머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
//      피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
//      n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면
//      최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
//      → 최소공배수

        /*

        n	result
        6	1
       10	5
        4	2

         */

        int n = 10;
        int answer=0;
        int sliceOfPizza = 6;
        int max = n > sliceOfPizza? n:sliceOfPizza;
        int cmax=0;

        for(int i =1; i<=max;i++){
            if(n%i==0 && sliceOfPizza%i==0){
                cmax = i;
            }
        }
        answer = (cmax*(n/cmax)*(sliceOfPizza/cmax))/sliceOfPizza;
        System.out.println(answer);


    }
}
