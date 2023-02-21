package classforjava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class cla04_loopstatement {
    public static void main(String[] args) {


//        1. 반복문

//        int num에 숫자가 주어졌을때
//        해당 숫자를 가지고 n*1, n*2, n*3 ... n*9 단을 출력해보자.
//        print함수로 개별로 출력
//        System.out.println(number + " * 1 = " + number * 1);
//        System.out.println(number + " * 2 = " + number * 2);
//        System.out.println(number + " * 3 = " + number * 3);
//        System.out.println(number + " * 4 = " + number * 4);
//        System.out.println(number + " * 5 = " + number * 5);
//        System.out.println(number + " * 6 = " + number * 6);
//        System.out.println(number + " * 7 = " + number * 7);
//        System.out.println(number + " * 8 = " + number * 8);
//        System.out.println(number + " * 9 = " + number * 9);

//        1) while문  : 기본문법은 특정조건을 맞추지 않으면 무한반복 하는 것이 기본 조건
//                      while문(반복문) 작성을 위해서는 반복되는 규칙을 찾아라(수열)

        System.out.println("[while문]");
        System.out.println("(예제1) 입력받은 숫자 구구단 ");
//
        //Scanner sc = new Scanner(System.in);
        //System.out.print("번호를 입력하세요 : ");

        int number = 3; //sc.nextInt();
        int a = 1;
        while (a < 10) {
            System.out.println(number + " * " + a + " = " + number * a);
            a++;
        }

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("(예제2-코딩테스트) 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요");
        System.out.println("n=54321 일때, 5+4+3+2+1 = ?");

        int n = 0;
        int l = 0;
        int k =0;
        int answer =0;

        n=54321;
        while(n>0){
            l = n % 10;  // l = 1     l = 2
            k = k+l;     // k = 0+1   k = 1+2
            n = n / 10;  // n = 5432  n = 543
        }

        answer = k;
        System.out.println(k);

        System.out.println("(예제3) 약수의 갯수 구하기");
//        약수의 갯수를 구하기 → 나누 었을 때 나머지가 0
//
        int n1 = 100;
        int i = 1;
        int j = 0;
        while(i<n1+1){
            if (n1 % i == 0) {
                j++;
            }
            i++;
        }

        System.out.println(j);
//
//        System.out.println(j);
//        int a= 10;
//
////        do-while
//        do {
//            System.out.println("hello");
//
//        } while(a>100);

//        사칙연산 프로그램 : while, switch 가지고
//        scanner를 통해서 + - * / 중 하나 입력
//        두개의 숫자 입력
//        while문은 무한 반복

//        Scanner st = new Scanner(System.in);
//        System.out.print("산식을 입력하세요");
//        String ch = st.nextLine();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("숫자 1을 입력하세요 : ");
//        double number = sc.nextDouble();
//        System.out.println(" 숫자 2을 입력하세요");
//        double number1 = sc.nextDouble();
//
//
//        switch (ch) {
//            case "+":
//                System.out.println(number + ch + number1 + " = " + (number + number1));
//                break;
//            case "-":
//                System.out.println(number + ch + number1 + " = " + (number - number1));
//                break;
//            case "*":
//                System.out.println(number + ch + number1 + " = " + (number * number1));
//                break;
//            case "/":
//                System.out.println(number + ch + number1 + " = " + (number / number1));
//                break;
//            default:
//                System.out.println(" - ");
//                break;
//
//
//        }
//
//        2) for문(초기식;조건식;증감식) {출력}

//        for(int a=100;a>0;a--){
//            System.out.println("hello"+a);
//        }


//        변수의 유효범위는 {  } 까지만 유효하고 하위 depth에서는 상위 depth값을 알지만
//        상위 depth에서는 하위 depth에서 선언된 값을 알지 못한다.

//        배열
//        int n1 = 10;
//        int n2 = 20;
//        int n3 = 30;
        int[] arr1 = {10, 20, 30, 40, 50};
//        //System.out.println(arr1[0]);
//
//        for(int i = 0;i<5;i++){
//            arr1[i] +=10;
//            System.out.print(arr1[i]+" ");
//        }


//        ★3)enhanced for문(foreach문)
        for(int c : arr1){  // ★ c에 arr1의 값을 복사 arr1 속성 값이 int 타입이라 c를 int 타입으로 선언
            System.out.println(c);
        }

//        String 타입으로 "aaa", "bbb", "ccc", "ddd", "fff를 담고 foreach문을 통해 출력해보자
        String[] ch2 = {"aaa", "bbb", "ccc", "ddd", "fff"};

//        for문 사용
        for(int m=0;m<ch2.length;m++){
            System.out.println(ch2[m]);
        }

//      enhanced for문 (foreach문)
        for(String d : ch2){
            System.out.println(d);
        }

//        함수형 코딩(자바8부터 바뀜) → 사본으로 작업

//        2중(다중) 반복문
//        int num = 2;
//        for(int i = 2;i<6;i++){
//            System.out.println(i+"단 입니다.");
//            for(int j =1;j<10;j++)
//                System.out.println(i + " * "+j+" = "+i*j);
//        }


    } // 메인함수
} // 클래스