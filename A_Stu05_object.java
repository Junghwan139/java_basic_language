
//클래스 외부에는 package와 import선언만 가능
//클래스
public class A_Stu05_object {

    public static int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    } //add 함수

    static int getTenTotal() {
        int i;
        int total = 0;
        for (i = 1; i <= 10; i++) {
            total += i;
        }
        System.out.println(total);
        return total;
    } // getTenTotal 함수


    public static void main(String[] args) {

//        1. 객체지향
        System.out.println("1. 객체지향");
//        1) class
        System.out.println("1) class");
//        2) package
        System.out.println("2) package");
//        3) function(method) : int(반환형) add(함수이름) (int num1 매개변수)
        System.out.println("3) method");
        System.out.println("(예제 1) 함수 구현하고 호출하기 - 더하기 함수 호출");

        int num1 = 10;
        int num2 = 20;

        int sum = add(num1, num2); //add 함수 호출
        System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");

        System.out.println("(예제 2) 함수 구현하고 호출하기 - 10까지 합을 구하는 함수 호출");

        int count = getTenTotal(); // getTenTotal 함수 호출
        System.out.println(count);


    } //메인함수


}

