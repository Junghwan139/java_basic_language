package classforjava.completed.C_7W_2_anonymous;

import java.util.*;

public class C_7W_2_Main {

    public static void main(String[] args) {

//        << 퀴즈 >>
        String[] arr = {"abc", "bcd","bcc"};
        String answer = Arrays.stream(arr).filter(a -> a.length()>=5 && a.length()<=10).findFirst().map(a -> a.toUpperCase()).orElse("없음");
        System.out.println(answer);
        // stream은 arr을 매개변후 화 시킴(arr을 로컬화 하여 복사본을 만들어서 사용함)


//        1. (1단계) 익명 클래스 : 객체 선언 시 오버라이드를 해서 재정의 된 임시 객체를 선언하는 것.
//           임시 객체이다 보니 이름이 없어 이름을 출력하면 출력하는 클래스의 이름이 나온다.
//
//           (단점) 그리고 임시 객체여서 만들어진 내용을 반복 사용하기 위해서는 반복 선언이 필요함.
//           따라서 오버라이딩 하는 메소드가 1, 2개 인 경우 주로 사용.
//
//           ★ 그리고 일반적으로 인터페이스를 객체화 할 경우에 사용. 왜냐하면 인터페이스는 객체화를 할 수 없으나
//           익명객체를 통해 객체화 할 수 있고, 인터페이스는 어짜피 오버라이딩 해서 사용해야 하기 때문에..

//        << 예제 >> 인터페이스를 인스턴스로 만들기

        // 인터페이스로 객체를 만드니 구현을 하겠구나 예측
        Animal_Interface a1 = new Animal_Interface() {
            public
            @Override void play() {
                System.out.println("폴짝 폴짝 뜁니다.");
            }

            @Override
            public void shape() {
                System.out.println("척추 동물입니다.");

            }
        };

        a1.play();
        a1.shape();

//        2. (2단계) 익명 함수 : 부모 클래스 또는 인터페이스에 함수가 1개인 경우 익명함수로 바꿀 수 있음.

        Animal_Interface2 a2 = (String a) -> System.out.println(a+"play 예시 입니다.");
        a2.play("abc");

//        3. Comparator * 추가사항

        Student st1 = new Student();
        st1.setName("kim");
        st1.setAge(10);
        st1.setClassnum(3);

        Student st2 = new Student();
        st2.setName("lee");
        st2.setAge(12);
        st2.setClassnum(2);

        Student st3 = new Student();
        st3.setName("choi");
        st3.setAge(15);
        st3.setClassnum(1);

        List<Student> lst = new ArrayList<>();
        lst.add(st1);
        lst.add(st2);
        lst.add(st3);

/*
        // Comparator 보완 필요
        lst.sort(Comparator.comparing(a -> a.getClassnum()));

        for(Student a : lst){
            System.out.println(a.getName());
        }
*/
        Collections.sort(lst,((o1, o2) -> o1.getName().compareTo(o2.getName())));

        for(Student a : lst){
            System.out.println(a.getName());
        }







    }

}




class Student{

    private String name;
    private int age;
    private int classnum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClassnum() {
        return classnum;
    }

    public void setClassnum(int classnum) {
        this.classnum = classnum;
    }
}
