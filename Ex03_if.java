import java.util.Scanner;

public class Ex03_if {
    public static void main(String[] args) {

//        1. 조건문
//        1) if / if-else
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력해 주세요 : ");
        int age = sc.nextInt();
        System.out.println("당신의 나이는 " + age + "세 입니다.");
        if (age >= 8 && age <= 19) {
            System.out.println("학교에 다닙니다.");
        } else if (age < 8) {
            System.out.println("미취학 아동입니다.");
        } else {
            System.out.println("성인 입니다.");
        }

//        2) switch-case문



    }
}
