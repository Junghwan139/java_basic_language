package classforjava.typing;

import java.util.Arrays;

public class RecursiveCall2 {

    public static void main(String[] args) {

//        위 배열을 2개의 숫자로 조합할 수 있는 경우의 수를 나열하라
//        단 10, 20과 20,10은 같은 것으로 판단한다.

/*
        int[] arr = {10,20,30,40};
        int [] arr_temp = new int[3];
        for(int i =0;i<arr.length;i++) {
            arr_temp[0] = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                arr_temp[1] = arr[j];
                for (int k = j + 1; k < arr.length; k++) {
                    arr_temp[2] = arr[k];
                    System.out.println(Arrays.toString(arr_temp));
                }
            }
        }

*/




// 3개 짜리 조합을 출력하는 재귀함수 호출
        int[] arr = {10,20,30,40};
        int j = 0;
        recur(arr,new int[3],j,0);


    }

    // 예상하지 못하는 반복문의 깊이는 재귀함수를 통하여 처리필요

    static void recur(int[] arr,int[] arr_temp,int j,int ijk ){

        if(j==arr_temp.length){
            System.out.println(Arrays.toString(arr_temp));
            return;
        }
        for(int i =ijk; i<arr.length;i++){
            arr_temp[j] = arr[i];
            recur(arr,arr_temp,j+1,i+1);
        }


    }








}
