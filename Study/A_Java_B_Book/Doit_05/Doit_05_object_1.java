package Study.A_Java_B_Book.Doit_05;

//클래스 외부에는 package와 import선언만 가능
//클래스
public class Doit_05_object_1 {

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

//        1. 객체 지향 프로그래밍과 클래스
//        1) 객체와 객체 지향 프로그래밍

//        1) 클래스 : 객체의 속성과 기능을 코드로 구현한 것
//           - 한개의 파일 안에 여러개의 클래스 생성 가능. 단, public 은 1개만 가능
//           - 멤버 변수, 메서드로 구성됨. 변수 : 구성 항목, 메서드 : 행동

//        2. 클래스
//        1) 클래스 속성을 구현하는 멤버 변수
//         클래스(멤버 변수 / 함수, 클래스 변수 / 함수) & 인스턴스(객체, 메소드, 참조 변수, 참조 값, 힙메모리)
//         (1) 멤버변수 : 클래스 내부 변수(클래스의 속성, 특성)
//         (2) 인스턴스와 힙 메모리 : "클래스형 지역변수(참조변수) = new 클래스명" 을 선언하면
//                                 클래스가 하나 생성
//             → 클래스가 생성 된다 = 클래스를 사용할 수 있는 인스턴스 메모리공간(힙메모리)을 할당 받는다
//             → 지역변수(스택 메모리) - 인스턴스(힙메모리) = 지역변수는 인스턴스의 주소를 대입
//             * 메모리 : 스택, 힙, 데이터, 객체 생성은 힙 메모리 / 힙은 동적으로 할당되며 사용이 끝나면
//                      메모리를 해제해 주어야 한다. 자바에서는 가비지 컬렉터가 자동으로 메모리 해제
//        2) package (가장 큰 단위)

//        3. 함수
//        1) (스택메모리) : ex) int(반환형) add(함수이름) (int num1 매개변수) ~ return 반환값
//        2) 함수 내에 함수 선언은 안됨. 따라서 main()함수 내에 별도 함수 선언 불가
//           - 클래스의 activity 항목
//           - main() 함수 : 자바 가상 머신(jvm)이 프로그램을 시작하기 위해 호출하는 함수
//             → 클래스를 정의 하기 위한 함수가 아니며 java구동을 위한 함수 따라서 클래스 내부에
//               있을 필요가 없음
//           - main() 함수에서 클래스에 정의된 변수를 사용하기 위해서는
//             클래스를 참조(★클래스 생성이라 표현)해야 함
//             → 생성 코드 : 클래스형 변수이름 = new 생성자;
//           - ★★확인필요 : 클래스 멤버함수 중 Static으로 선언된 함수는 main()함수 바로 호출 가능

//        4. 클래스와 인스턴스
//        1) new 예약어로 클래스 생성하기
//        2) 인스턴스와 참조 변수
//          1) 객체 : '의사나 행위가 미치는 대상' -> 코드로 구현 "클래스"
//          2) 인스턴스(=객체) : 클래스가 메모리 공간에 생성된 상태
//          3) 참조변수 : 객체 생성 시에 객체를 받는 변수
//        3) 인스턴스와 힙 메모리
//        객체를 생성하면(클래스 생성자를 호출하면) 힙 메모리가 생성되고, 참조변수는 지역변수이므로
//        지역변수(참조변수)에 생성된 인스턴스를 대입하는 것은 힙 메모리의 주소를 대입하는 것과 같다.

//        클래스가 생성될 때마다 인스턴스는 다른 메모리 공간을 차지함. 멤버 변수를 저장하는 공간이 매번
//        따로 생김. 이런 이유 때문에 클래스에 선언한 멤버변수를 다른 말로 '인스턴스 변수'라고도 부른다.

        /*
         - 객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스
         - 클래스 : 객체를 프로그래밍하기 위해 만든 코드로 만든 상태
         - 인스턴스 : 클래스가 메모리에 생성된 상태
         - 멤버변수 : 클래스의 속성, 특성
         - 메서드 : 멤버 변수를 이용하여 클래스의 기능을 구현
         - 참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
         - 참조 값 : 생성된 인스턴스의 메모리 주소 값
        */

//        5. 생성자 (클래스를 생성할 때 사용하는 함수로 클래스와 동일한 이름을 가진 함수)
//        1) 생성자란? 클래스의 멤버 변수는 메서드에 의해 값이 변경될 수도 있지만, 처음 클래스를 생성할 때
//                   값을 정해야 하는 경우도 있다. 생성자가 하는 일은 클래스를 처음 만들 때 멤버 변수나
//                   상수를 초기화하는 것
//        2) 생성자 만들기
//        3) 생성자 오버로드 : 클래스에 생성자가 두 개 이상 제공되는 경우

//        6. 참조 자료형 : 클래스 자료형으로 선언하는 변수

//        7. 정보은닉
//        1) 접근 제어자 살펴보기
//        2) get(), set() 메서드
//        3) 정보 은닉이란?




        



//        (예제 1) 함수 구현하고 호출하기 - 더하기 함수 호출

        int num1 = 10;
        int num2 = 20;

        // class 멤버 변수, 함수 사용 할때는 클래스 생성
        Doit_05_object_1 aoj = new Doit_05_object_1("안연수");  // 클래스 생성
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
    public Doit_05_object_1(String sName)
    {
        this.studentName = sName;
    }

    // 디폴트 생성자
    public Doit_05_object_1(){}
    

}

