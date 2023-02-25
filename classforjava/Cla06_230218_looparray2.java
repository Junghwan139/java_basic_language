package classforjava;

public class Cla06_230218_looparray2 {

    public static void main(String[] args) {


//        3. 배열의 자리 바꿈

//        4. 정렬

//        1) bubble sort
//        if(arr[i] < arr[i+1]
//        2중 포문 + 뒷자리가 차면 그 횟수만큼 줄어들어야 하는 것도 감안

//        int[] arr1 = {50, 60, 40, 70, 10, 20};
//        테스트케이스를 몇개 만드세요.
//        arr.legnth-1 : 전체반복횟수
//        세부 반복횟수 : 5+4+3+2+1

//        함수를 이용하는 방법 : Arrays.sort(arr);


/*


        int temp = 0;
        for (int j = 0; j < arr1.length; j++) {
            Boolean check = true;
            for (int i = 0; i < arr1.length -i - 1; i++) {  // 밖에 있는 i만큼 빼줌
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




//        2) selection sort
//        5번 반복 0번째 자리 확정
//        4번 반복 1번째 자리 확정
//        (차이점) bubble은 바깥 반복문은 의미없음(전체 횟수 반복만)


        int[] arr = {50, 20, 60, 40, 30, 10};
        int temp = 0;

        for(int i = 0;i<arr.length-1;i++){    // i < arr.length-1
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


*/

//        5. continue, break 문

/*

//        1~100중에서 5의 약수 또는 7의 약수를 제외한 값을 출력
        int num = 1;


        while(num<101){
            if(num%5==0 || num%7==0){
//                반복문 내에서 조건문 검사로 다시 올라가도록 하는 구문
//                아래와 같이 coding할 경우 무한 루프

            }else{
                System.out.println(num);
            }
            num++;
        }



        for(int i =0; i<101; i++){
            if(i%5==0 || i%7==0){
                continue;
            }else{
                System.out.println(i);
            }

//            추가적인 구문이 더 있을 경우에 해당 구문을 실행시킬 필요가 없을 때 continue; 사용

        }

*/

/*


//        break문은 중도에 반복문을 강제로 종료 시키는 것.
//        1~100까지
        int num = 1;
        while (true) {
            if (num % 5 == 0 || num % 7 == 0) {
            } else {
                System.out.println(num);
            }
            num++;
            if (num > 100) {
                break;
            }
        }

*/

/*

// break 라벨링
        int temp = 0;
        firstFor:
        for (int j = 0; j < arr1.length; j++) {
            Boolean check = true;
            for (int i = 0; i < arr1.length -i - 1; i++) {  // 밖에 있는 i만큼 빼줌
                if (arr1[i] > arr1[i + 1]) {
                    temp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = temp;
                    check = false;  // 자리바꿈이 일어나면 false, 일어나지 않으면 true로 for문을 빠져나감
                    break firstFor; // 라벨링
                }
            }
            }

        }
        System.out.println(Arrays.toString(arr1));


*/


/*

        Label1 :
        for(int i =0; i<5; i++){
            System.out.println("first for문"+i);
            Label2 :
            for(int j =0;j<5;j++){
                System.out.println("second for문"+j);
                if(j==1){
                    break Label1;
                }
            }
        }

*/




    } // 메인함수
}  // 클래스
