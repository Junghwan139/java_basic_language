public class Le04_loopstatement {
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

//        //while문 기본 문법 : 특정조건을 맞추지 않으면 무한반복 하는 것이 기본 조건 → 규칙을 찾아라(수열)
//        Scanner sc = new Scanner(System.in);
//        System.out.print("번호를 입력하세요 : ");
//        int number = sc.nextInt();
//
//        int a =1;
//
//        while(true){
//            a=1;
//
//            while(a<10){
//                System.out.println(number+" * "+a+" = "+number*a );
//                a++;
//            }
//
//        }

//        정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

//        int n = 0;
//        int l = 0;
//        int k =0;
//        int answer =0;
//        n = 32;
//        l = 32/10+32%10;
//        System.out.println(l);
//        n = 321;
//        answer +=a%10
//        a/=10
//        answer +=a%10
//        a/=10
//        answer +=a%10

//        l = 321/100+321%100/10+321%100%10;
//        System.out.println(l);
//        n = 4321;
//        l = 4321%10+4321/10%10+4321/10/10%10+4321/10/10/10%10;
//        System.out.println(l);

//        n=54321;
//        while(n>0){
//            l = n % 10;
//            k = k+l;
//            n = n / 10;
//        }
//        answer = k;
//        System.out.println(k);
//

//        약수의 갯수를 구하기
//
//        int n = 100;
//        int i = 1;
//        int j = 0;
//        while(i<n+1){
//            if (n % i == 0) {
//                j++;
//            }
//            i++;
//        }
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
        //for(초기식;조건식;증감식)
        //   {출력}

//        for(int a=100;a>0;a--){
//            System.out.println("hello"+a);
//        }



//        변수의 유효범위는 {  } 까지만 유효하고 하위 depth에서는 상위 depth값을 알지만
//        상위 depth에서는 하위 depth에서 선언된 값을 알지 못한다.

//        배열
//        int n1 = 10;
//        int n2 = 20;
//        int n3 = 30;
//        int[] arr1 = {10, 20, 30, 40, 50};
//        //System.out.println(arr1[0]);
//
//        for(int i = 0;i<5;i++){
//            arr1[i] +=10;
//            System.out.print(arr1[i]+" ");
//        }



//        enhanced for 문
//
//        for(int a : arr1){
//            System.out.println(a);
//        }

//        String 타입으로 "aaa", "bbb", "ccc", "ddd", "fff를 담고 foreach문을 통해 출력해보자

//        String[] ch2 = {"aaa", "bbb", "ccc", "ddd", "fff"};
//
//        for(int i=0;i<ch2.length;i++){
//            System.out.println(ch2[i]);
//        }
//
//        for(String a : ch2){
//            System.out.println(a);
//        }


//        함수형 코딩(자바8부터 바뀜) → 사본으로 작업

//        2중(다중) 반복문

        int num = 2;
        for(int i = 2;i<6;i++){
            System.out.println(i+"단 입니다.");
            for(int j =1;j<10;j++)
                System.out.println(i + " * "+j+" = "+i*j);
        }



        




    } // 메인함수
} // 클래스
