package classforjava.completed.c_7w;

public class C_7W_main {

    public static void main(String[] args) {

//        1. 상속(extends) : 부모 클래스를 상속 받음, 자바에서 다중상속은 불가하다. 부모의 변수 + 메서드를 상속(생성자는 제외)
//                          부모의 생성자를 상속받고 싶으면 자식클래스의 생성자에 super()를 추가(this())와 유사하게 이해할 것
//                          private 변수는 상속을 받지 못 한다.

//        1) 함수
//         (1) super()
//           ① 생성자에 사용 Cat(String name, int age){
//              super(name, age);         }   // 자식 클래스에 name, age변수를 정의하지 않았으나, 부모 클래스의 private 변수를
//                                                                                         super()로 간접 사용
//           ② super.변수 → 부모 변수를 명시


//        2. 구현(implements) : interface 파일을 별도로 생성하고 거기에 함수를 선언만 해놓음(body 없음). 구현하는 클래스에서는
//                             모든 메서드를 정의 하도록 강제 -> 해당 클래스에서는 필수 적으로 interface의 모든 메소드를 override해야 함
//                             자바에서 인터페이스 다중 구현은 가능하다.(구현은 메서드 내용 작성을 구현하는 클래스에서 하기 때문에 상관 없음)

//        1) interface : 인터페이스에서 모든 메서드는 추상메서드. 즉, 내용이 구현되어 있으면 안됨.

//        * Overloading & Overriding : overloading은 메소드의 매개변수를 달리하여(갯수, 타입) 재정의 하는 것
//                                     overriding은 상속 또는 구현 시 메소드를 재정의 하는 것
//          override일 경우 @Overrride라고 어노테이션 해줄 것
//        * List는 interface고, ArrayList, LinkedList 등 구현체들에게 메서드 overrideing을 강제 한다.


//        3. 접근 제어자 : 클래스 public, default만 가능(private, protected불가)
//                       범위 크기 → public > protected > default > private
//        1) public : 모두 접근 가능        
//        2) protected : 패키지내 or 상속시 모두 접근 가능 / 변수의 경우 상속을 받을 경우 다른 패키지라 할지라도 접근 가능
//        3) default : 패키지내에서만 접근 가능
//        4) private : 클래스 내에서만 접근 가능

//        4. 기타 키워드
//        1) final : 변수, 메서드, 클래스에 모드 사용 가능
//                   주로 변수 앞에 변경 불가능한 상수를 나타내는 키워드로 사용
//                   클래스 앞에 붙으면 상속불가, 메서드 앞에 붙으면 overriding 불가
//        2) abstract : 제어자가 반드시 오버라이딩 하도록 강제(인터페이스 - 구현 처럼) 메소드가 1개라도 abstract가 있는 경우
//                      클래스에도 abstract해야하고, 자식에서도 오버랴이딩 해야됨.
//                      특정 메소드를 인터페이스 화 시킴, 바디 구현 불가
//




    }

}
