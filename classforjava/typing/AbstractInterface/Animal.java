package classforjava.typing.AbstractInterface;

//final을 클래스 앞에 붙이면 상속불가한 클래스가 된다.
public class Animal {

    // protected는 상속관계 또는 패키지내에서만 접근가능한 변수가 되도록 하는 것
    private String name;
    private int age;

//    접근범위 default
    String nick_name = "나옹이animal";

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    void play(){
        System.out.println("네발로 뜁니다.");
    }

    // final이 붙으면 자식 클래스에서 오버라이딩 불가
    public final void shape(){
        System.out.println("척추 동물입니다.");
    }

    // abstract 제어자 반드시 오버라이딩 하도록 강제(인터페이스 처럼) 클래스에도 abstract해야하고,
    // 자식에서도 오버라이딩 해야됨
    // 특정 메소드를 인터페이스 화 시킨 방식, 바디 불가(구현x)
    // 하나라도 abstract메소드가 있으면 클래스에도 abstract 키워드를 붙여야 한다.
    // public abstract void abstract_test(){

    }



