package ByMyself.C_Java_Codingtest;

public class Ct010_reverse {
    public static void main(String[] args) {

//        << 배열 뒤집기 >>

//        정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
//        num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

        /*

         입출력 예
         num_list	result
         [1, 2, 3, 4, 5]  	    [5, 4, 3, 2, 1]
         [1, 1, 1, 1, 1, 2]	    [2, 1, 1, 1, 1, 1]
         [1, 0, 1, 1, 1, 3, 5]	[5, 3, 1, 1, 1, 0, 1]


        */

        int[] num_list = {1, 2, 3, 4, 5};
        int[] answer = new int[num_list.length];
        int cout = 1;

        for (int i = 0;i<num_list.length;i++){
            answer[i]=num_list[num_list.length-cout];
            cout++;
            System.out.println(answer[i]);
        }



/*      배열 뒤집기
        int mess = 0;
        int j = 1;
        if (num_list.length % 2 != 0) {
            for (int i = 0; i < num_list.length / 2; i++) {
                mess = num_list[i];
                num_list[i] = num_list[num_list.length - j];
                num_list[num_list.length - j] = mess;
                j++;
            }
        } else {
            for (int i = 0; i < num_list.length / 2+1; i++) {
                mess = num_list[i];
                num_list[i] = num_list[num_list.length -j];
                num_list[num_list.length - j] = mess;
                j++;

            }

        }
        for(int i = 0;i<num_list.length;i++){
            System.out.println(num_list[i]);
        }

        */




    }
}