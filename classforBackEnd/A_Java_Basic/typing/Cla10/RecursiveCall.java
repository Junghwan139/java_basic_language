package classforBackEnd.A_Java_Basic.typing.Cla10;

public class RecursiveCall {

    public static void main(String[] args) {

//        재귀적인(반복적인), 반복문 → for문, while문이 없어도 반복가능
//        재귀함수란 특정함수가 자기자신을 호출하는 형태의 함수를 말한다.

//       Q1. 숫자 n이 있을때 1~n까지의 합계를 구하라.

        // 방법1. for문이나 while문을 통해 반복연산을 한다.
/*    int n = 10;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }

        System.out.println(total);

        int recur_test = 1;
        int recur_total = 0;
        recur_add(recur_test, recur_total);

        int recur_total2 = recur_add2(recur_test);
        System.out.println(recur_total2);
*/

//        Q2. factorial을 재귀함수로 구현

        factorial(10);
        System.out.println(multi);
        System.out.println(10*9*8*7*6*5*4*3*2*1);

        int factorial_total2 = factorial2(10);
        System.out.println(factorial_total2);


    }

/*
     // 방법 2. 클래스 변수(static)를 선언하여 클래스변수에 더하여 계산
    // static total 선언

    // 방법 3. 매개변수 추가 (+ 재귀함수 밖에서 꺼낼때는 static을 활용하기도 한다.)
    public static void recur_add(int a, int sum) {
        sum += a;
        if (a == 10) {
            System.out.println(sum);
            return;
        }
        recur_add(a + 1, sum);

    }

    // 방법 4. return을 void가 아닌 int로 둔다.

    public static int recur_add2(int a) {
        if (a == 10) {
            return 10;
        }
        return a + recur_add2(a + 1);

    }

*/

    static  int multi = 1;
    public static void factorial(int a){
        multi *= a;
        if(a==1){
            return;
        }
        factorial(a-1);
    }

    public static int factorial2(int a){
        if(a==1){
            return 1;
        }
        return a * factorial2(a-1);
    }












}
