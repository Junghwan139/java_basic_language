package classforjava.typing;

public class Cla09_ClassIntro {

    public static void main(String[] args) {

//        java의 아키텍처 / 구조 -> Spring 프레임워크(java코드 library)

//        1. linkedin : 이력서
//        2. github - portpolio
//        3.

//        int a = 10;
//        int b = 5;

//        Class는 변수 + 함수의 집합
//        static이 붙으면 메서드가 아니라, 클래스 함수라 부른다.
//        메서드는 클래스를 통해 만들어진 객체의 함수다.
//        객체라는 것은 class를 통해 만들어진 복제본이다.
//        만드는 방식은 new class명을 통해 생성하고 instance라고도 부른다.
        
//        객체를 만들면 heap메모리 공간에 저장되어, 휘발되지 않는 성질을 가진다. (static붙으면 클래스 / 변수, 함수, 없으면 객체)

//        객체를 여러개 만들어야 하는 이유? 예를 들어 자회사가 여러개인 회사의 각 회사별 누적 실적을 구한다고 했을때에는
//        각 누적 합을 별도로 가지고 있어야 함. (붕어빵틀- 붕어빵)

//        클래스변수와 클래스 함수를 사용한 방식과 객체를 사용한 방식의 차이점
//        a회사의 재무처리를 한다.
//        클래스 변수와 클래스 함수를 사용한 방식의 문제점
//        int total_a = ClassInstanceDifference1.add(10);
//        int total_b = ClassInstanceDifference1.add(20);
//        System.out.println(total_b);
//        System.out.println(ClassInstanceDifference1.total);

//        클래스의 복제본을 만드는게 객체이고, 각 변수명을 calA.instance_total calB.instance_total 등 따로 관리하게된다.

//        System.out.println(ClassInstanceDifference1.static_total);
//        int totalA = ClassInstanceDifference1.static_add(10);
//        System.out.println(totalA);
//        int totalB = ClassInstanceDifference1.static_add(10);
//        System.out.println(totalB);

//        ClassInstanceDifference1 ci1 = new ClassInstanceDifference1();
//        System.out.println(ci1.instance_total);
//        ci1.instance_add(10);
//        System.out.println(ci1.instance_total);
//
//        ClassInstanceDifference1 ci2 = new ClassInstanceDifference1();
//        System.out.println(ci2.instance_total);
//        ci2.instance_add(10);
//        System.out.println(ci2.instance_total);

        InstanceUserSample user1 = new InstanceUserSample();
//        user1.name = "kim";
//        user1.email = "abc@naver.com";
//        user1.password = "aaaa";
//        user1.age = 20;
        // 위와 같이 현업에서는 잘 안함. (값을 변수에 직접 접근해서 셋팅)
        // 전형적인 객체형식 예제
//        user1.whoIs("홍","abc@naver","aaa",20);
//        user1.getUserInfor();
        user1.setName("홍길동");
        System.out.println(user1.getName());
        user1.setPassword("aaa");

        System.out.println("이름은 "+user1.getName());
        System.out.println("비밀번호는 "+user1.getPassword());

        // System.out.println(user1.method1(2,3));










    }




}
