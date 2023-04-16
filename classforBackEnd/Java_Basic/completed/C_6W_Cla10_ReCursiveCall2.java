package classforBackEnd.Java_Basic.completed;

import java.util.Arrays;

public class C_6W_Cla10_ReCursiveCall2 {

    public static void main(String[] args) {

//        아래 배열을 2개의 숫자로 조합할 수 있는 경우의 수를 나열하라
//        단 10, 20과 20,10은 같은 것으로 판단한다.

        int[] arr = {10,20,30,40};
        int[] arr_temp = new int[3];


/*

//        << for문 사용 >>
        for(int i = 0;i<arr.length;i++){
            arr_temp[0] = arr[i];
            for(int j = i+1;j<arr.length;j++){
                arr_temp[1] = arr[j];
                for(int k = j+1;k<arr.length;k++){
                    arr_temp[2] = arr[k];
                    System.out.println(Arrays.toString(arr_temp));
                }
            }
        }
*/

        for(int i =0;i<arr_temp.length;i++){
            recur(arr,new int[i],0,0);
        }

    }


    public static void recur(int[] arr, int[] arr_temp,int a,int b){

            if(a==arr_temp.length){
                    System.out.println(Arrays.toString(arr_temp));
                return;
            }


        for(int i = b;i<arr.length;i++){
            arr_temp[a] = arr[i];

             recur(arr,arr_temp,a+1,i+1);

        }

    }


}
