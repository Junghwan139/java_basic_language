
//클래스 외부에는 package와 import선언만 가능
//클래스
public class Stu05_object {
    int csId;


    //add 함수
    public static int add(int n1, int n2){
        int result = n1 + n2;
        return result;
    }

    //메인함수
    public static void main(String[] args) {
        //        << 공부 >>

//        1. 객체지향
        System.out.println("1. 객체지향");
//        1) class
        System.out.println("1) class");
//        2) package
        System.out.println("2) package");
//        3) method
        System.out.println("3) method");
        System.out.println("(예제 1) 함수 구현하고 호출하기");

        int num1 = 10;
        int num2 = 20;

        int sum = add(num1,num2);
        System.out.println(num1+" + "+num2+" = "+sum+"입니다.");

    }



    }

