package Study.A_Java_C_Codingtest;

public class Ct011_numberCount {
    public static void main(String[] args) {

//        << 짝수 홀수 개수 >>
//        정수가 담긴 리스트 num_list가 주어질 때,
//        num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

        /*

         num_list	result
         [1, 2, 3, 4, 5]	[2, 3]
         [1, 3, 5, 7]	    [0, 4]


        */

        int [] num_list = {1,2,3,4,5};
        int [] answer = new int [2];
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i<num_list.length;i++){
            if(num_list[i]%2==0){
                evenCount++;
            }else {
                oddCount++;
            }


        }

        answer[0]=evenCount;
        answer[1]=oddCount;

    }
}
