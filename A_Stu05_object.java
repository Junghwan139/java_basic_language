
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

//        1) class : 객체
//           - 멤버 변수, 메서드로 구성됨. 변수 : 구성 항목, 메서드 : 행동
        System.out.println("1) class");

//        2) package (가장 큰 단위)
        System.out.println("2) package");
        
//        3) 함수(메서드) : int(반환형) add(함수이름) (int num1 매개변수)
//           - 클래스의 activity 항목,

        System.out.println("3) method");
        System.out.println("(예제 1) 함수 구현하고 호출하기 - 더하기 함수 호출");

        int num1 = 10;
        int num2 = 20;

        int sum = add(num1, num2); //add 함수 호출
        System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");

        System.out.println("(예제 2) 함수 구현하고 호출하기 - 10까지 합을 구하는 함수 호출");

        int count = getTenTotal(); // getTenTotal 함수 호출
        System.out.println(count);
//           - main() 함수 : 자바 가상 머신(jvm)이 프로그램을 시작하기 위해 호출하는 함수
//             → 클래스를 정의 하기 위한 함수가 아니며 java구동을 위한 함수 따라서 클래스 내부에
//               있을 필요가 없음
//           - main() 함수에서 클래스에 정의된 변수를 사용하기 위해서는
//             클래스를 참조(★클래스 생성이라 표현)해야 함
//             → 생성 코드 : 클래스형 변수이름 = new 생성자;

        A_Stu05_object aoj = new A_Stu05_object( );  // 클래스 생성
        aoj.studentName = "안연수";
        System.out.println(aoj.studentName);

    } //메인함수



    int studentID;
    String studentName;



}

