package ByMyself.A_Java_C_Codingtest;

public class Ct132_sum {

    public static void main(String[] args) {

        int[] num_list = {3,4,5,2,1};
        int answer = 0;

        String odd = "";
        String even = "";

        for(Integer a : num_list){
            if(a%2==0){
                even += a.toString();
            }else{
                odd += a.toString();
            }
        }
        answer = Integer.parseInt(odd) + Integer.parseInt(even);

        System.out.println(answer);



    }

}
