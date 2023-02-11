import java.util.Scanner;

public class Le03_loopstatement {
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

        //while문 기본 문법
        Scanner sc = new Scanner(System.in);
        System.out.print("번호를 입력하세요 : ");
        int number = sc.nextInt();

        int a =1;

        while(true){
            a=1;

            while(a<10){
                System.out.println(number+" * "+a+" = "+number*a );
                a++;
            }

        }









    }

}
