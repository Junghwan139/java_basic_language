package classforBackEnd.Java_Basic.completed;

import java.util.Arrays;

public class C_3W_Cla05_looparray_S {

    public static void main(String[] args) {

        int[] arr = {100, 20, 30, 60, 80, 20};
//        1. 총합, 평균, 최대값, 최소값

//        1) 총합
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("총합 =" + total);

//        2) 평균
        double avg = (double) total / arr.length;   // double 값 계산시 1개 값에 double 필요
        System.out.println("평균 =" + avg);

//        3) 최대값
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("최대값 = " + max);

//        4) 최소값
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];

            }
        }
        System.out.println("최소값 = " + min);

//        5) Stream을 사용한 값 계산
        int sTotal = Arrays.stream(arr).sum();
        double sAverage = Arrays.stream(arr).average().getAsDouble();
        int sMin = Arrays.stream(arr).min().getAsInt();
        int sMax = Arrays.stream(arr).max().getAsInt();

        System.out.printf("총합 : %d, 평균 : %f, 최소값 : %d, 최대값 : %d \n",sTotal,sAverage,sMin,sMax);


//        2. 최대공약수, 최소공배수

//        1) 최대공약수
//        * 배열값이 변경 / 나누는 수 고정 → 뭘 돌릴지 생각
        int cmax = 0;
        for (int i = 1; i < min; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % i == 0) {
                    count++;
                }
                if (count == arr.length) {
                    cmax = i;
                }
            }
        }
        System.out.println(cmax);

        for (int i = 1; i <= min; i++) {
            boolean trueOrNot = true;
            for (int a : arr) {
                if (a % i != 0) {
                    trueOrNot = false;
                }
            }
            if (trueOrNot == true) {
                cmax = i;
            }
        }

        System.out.println(cmax);


//        3. 배열의 자리 바꿈

//        4. 정렬

        int[] arr1 = {50, 60, 40, 70, 10, 20};
        int temp = 0;

//        1) bubble sort
//        if(arr[i] < arr[i+1]
//        2중 포문 + 뒷자리가 차면 그 횟수만큼 줄어들어야 하는 것도 감안

        for (int j = 0; j < arr1.length; j++) {
            Boolean check = true;
            for (int i = 0; i < arr1.length - 1; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    temp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = temp;
                    check = false;  // 자리바꿈이 일어나면 false, 일어나지 않으면 true로 for문을 빠져나감
                }
            }
            if(check == true){
                break;
            }

        }
        System.out.println(Arrays.toString(arr1));


    }
}
