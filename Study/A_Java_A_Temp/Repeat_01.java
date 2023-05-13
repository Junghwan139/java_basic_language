package Study.A_Java_A_Temp;

public class Repeat_01 {

    public static void main(String[] args) {


/*

        1. 상속 : 부모클래스를 상속받음, 자바에서 다중상속은 불가, 부모의 변수+메서드를 상속
        부모의 생성자를 상속받고 싶으면 자식 클래스의 생성자에 super()를 추가(this())와 유사하게 이해할 것
        private 변수는 상속을 받지 못 한다.

        2. 구현(implements) : interface 파일을 별도로 생성하고 거기에 함수를 선언만 해 놓음(body없음) 구현하는 클래스에서는 모든
        메서드를 정의하도록 강제 -> 해당 클래스에서는 필수 적으로 interface의 모든 메소드를 override해야 함.
        - overloading & overriding : 오버로딩은 메소드의 매개변수를 달리하여(갯수, 타입) 재정의 하는 것
        오버라이딩은 상속 또는 구현 시 메소드를 재정의 하는 것



*/

        test22 ts = new test22();
        ts.cry();
        ts.play();

        animal_int a1 = new animal_int() {
            @Override
            public void play() {
                System.out.println("익명 클래스_play");
            }

            @Override
            public void cry() {
                System.out.println("익명 클래스_cry");
            }
        };

        a1.cry();
        a1.play();

        animal_int2 a2 = () -> {

            System.out.println("익명 클래스2_play");

        };

        a2.play();

        Student1 st1 = new Student1();
        st1.student_name = Etest.First;

        System.out.println(st1.student_name);






    }




}

interface animal_int {

    void play();
    void cry();


}

interface animal_int2 {

    void play();

}




class test22 implements animal_int{

    @Override
    public void play() {
        System.out.println("동물 오버라이드_play");
    }

    @Override
    public void cry() {
        System.out.println("동물 오버라이드_cry");
    }
}

enum Etest{
    First, Second, third
}

class Student1{
    Etest student_name;
}