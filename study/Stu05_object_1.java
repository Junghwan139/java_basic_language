package study;

//클래스 외부에는 package와 import선언만 가능
//클래스
public class Stu05_object_1 {

    // 클래스 멤버변수
    int studentID;
    float height;
    float weight;
    String studentName;

    //add 함수
    int add(int n1, int n2) {
        int result = n1 + n2;
        return result;

    }

    // getTenTotal 함수
    static int getTenTotal() {
        int i;
        int total = 0;
        for (i = 1; i <= 10; i++) {
            total += i;
        }
        System.out.println(total);
        return total;

    }

    // main() 함수
    public static void main(String[] args) {

//        1. 객체지향

//        1) class : 객체
//           - 한개의 파일 안에 여러개의 클래스 생성 가능. 단, public 은 1개만 가능
//           - 멤버 변수, 메서드로 구성됨. 변수 : 구성 항목, 메서드 : 행동


//        2) package (가장 큰 단위)

//        3) 함수(메서드) : ex) int(반환형) add(함수이름) (int num1 매개변수)
//           - 함수 내에 함수 선언은 안됨. 따라서 main()함수 내에 별도 함수 선언 불가
//           - 클래스의 activity 항목,
//           - main() 함수 : 자바 가상 머신(jvm)이 프로그램을 시작하기 위해 호출하는 함수
//             → 클래스를 정의 하기 위한 함수가 아니며 java구동을 위한 함수 따라서 클래스 내부에
//               있을 필요가 없음
//           - main() 함수에서 클래스에 정의된 변수를 사용하기 위해서는
//             클래스를 참조(★클래스 생성이라 표현)해야 함
//             → 생성 코드 : 클래스형 변수이름 = new 생성자;
//           - ★★확인필요 : 클래스 멤버함수 중 Static으로 선언된 함수는 main()함수 바로 호출 가능

//        4) 클래스(멤버 변수, 메소드) & 인스턴스(참조 변수, 참조 값, 힙메모리)
//           - 인스턴스와 힙 메모리 : "클래스형 지역변수(참조변수) = new 클래스명" 을 선언하면
//                                 클래스가 하나 생성
//             → 클래스가 생성 된다 = 클래스를 사용할 수 있는 인스턴스 메모리공간(힙메모리)을 할당 받는다
//             → 지역변수(스택 메모리) - 인스턴스(힙메모리) = 지역변수는 인스턴스의 주소를 대입
//             * 메모리 : 스택, 힙, 데이터, 객체 생성은 힙 메모리 / 힙은 동적으로 할당되며 사용이 끝나면
//                      메모리를 해제해 주어야 한다. 자바에서는 가비지 컬렉터가 자동으로 메모리 해제

//        (예제 1) 함수 구현하고 호출하기 - 더하기 함수 호출

        int num1 = 10;
        int num2 = 20;

        // class 멤버 변수, 함수 사용 할때는 클래스 생성
        Stu05_object_1 aoj = new Stu05_object_1("안연수");  // 클래스 생성
        System.out.println(aoj.studentName);



        int sum = aoj.add(num1, num2); //add 함수 호출
        System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");

//        (예제 2) 함수 구현하고 호출하기 - 10까지 합을 구하는 함수 호출

        getTenTotal(); // 함수호출 (static으로 선언되어 바로 사용 가능)

//        5) 생성자
//           - main함수, 다른 클래스에서 이 클래스를 사용할 때 클래스를 생성하는 조건

//        6) 참조 자료형
//           - 클래스를 자료형처럼 선언 가능(ex.학생 클래스에서 과목 성적을 넣고 싶으면 과목을 자료형으로 선언)
        

//        7) 정보 은닉(접근 제어자)




    } //메인함수



    // 생성자(작성자가 만든)
    public Stu05_object_1(String sName){
        studentName = sName;
    }

    // 디폴트 생성자
    public Stu05_object_1(){}
    

}

