package classforBackEnd.A_Java_Basic.completed;

import java.util.Arrays;

public class C_3W_Cla06_230218_looparray2_S {
    public static void main(String[] args) {

//        - (복습) 최대공약수
        int[] arr = {10, 20, 30, 40, 50, 60};
        int min = arr[0];
        int temp = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.printf("최소값 : %d \n",min);

        int cmax= 0;

        for(int i =1;i<=min;i++){
            Boolean check = true;
            for(int j =0;j<arr.length;j++){
                if(arr[j]%i!=0){
                    check = false;
                }
                if(check ==true ){
                    cmax = i;
            }

            }

        }
        System.out.println(cmax);


//        - (복습) bubble sort
        temp = 0;
        int count = 0;
        int count1 = 0;
        for(int j = 0;j<arr.length-1;j++){
            boolean check = true;
        for(int i = 0;i<arr.length-1-j;i++){
            if(arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                check = false;
                count++;
            }
        }
        count1++;
        if(check == true) {break;}
       }

        System.out.println(Arrays.toString(arr));
        System.out.println(count);
        System.out.println(count1);

//        - (복습) Arrays.sort 이용한 정렬

        int[] arr1 = {90, 20, 10, 80, 30, 100};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));


//        - (복습) selection sort

//        1. continue문 : 만나면 반복문으로 올라감 continue문 아래 실행 x
//        2. break문 : 가장 가까운 반복문을 종료시킴. 다중 반복문일 경우 다른 반복문을 종료
//                     시키고 싶으면 라벨링을 해야 함.




















    }
}
