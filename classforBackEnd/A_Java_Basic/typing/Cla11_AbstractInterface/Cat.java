package classforBackEnd.A_Java_Basic.typing.Cla11_AbstractInterface;

// 자바에서 다중상속은 불가하다.
public class Cat extends Animal {
    // 부모의 변수 + 메서드를 상속(생성자는 제외)
    // 부모의 생성자를 상속받고 싶으면 자식클래스의 생성자에 super()를 추가, this()와 유사하게 이해하면 될 듯.

    Cat(String name, int age){
        super(name, age);
//        super를 통해 아래와 같이 초기화 로직을 상속
//        super를 통해 priavate변수가 접근이 안됨에도, animal클래스가 초기화를 진행하므로
//        간접적으로 private변수도 사용할 수가 있게 된다.
//        this. name = name;
//        this. age = age;
    }




    void cry(){
        System.out.println("야옹야옹");
    }

//    public void shape(){
//    }  final은 오버라이드 불가


    //    접근범위 default
    String nick_name = "나옹이cat";


    // private 변수는 상속을 받지 못 한다.
    void test_print(){
        System.out.println(nick_name);
        // super 키워드를 통해 부모클래스의 변수임을 명시한 것
        // cat의 nikc_name 있으면 cat의 변수값, 없으면 부모의 nick_name 변수값이 출력
        System.out.println(super.nick_name);
    }

    @Override //어노테이션은 옵션
    public void play() {
        System.out.println("사뿐사뿐 걸어다닙니다.");
    }



}

// 클래스안에 클래스가 더 있는 경우는, 내부클래스가 있는 경우.
// 한 클래스 내에 public 클래스는 1개만 가능.
// 인터페이스를 구현(implements)하려면 반드시 인터페이스에 정의된 모든 메서드를 구현해야 한다.
class CatImplements implements AnimalInterface1 {

    // 메서드 overide : 상속 또는 구현 시 부모클래스(인터페이스)의 기능을 재정의 하는 것.

    @Override
    public void play() {
        System.out.println("사뿐사뿐 걸어다닙니다.");
    }

    @Override
    public void shape() {
        System.out.println("날렵하게 생겼습니다.");

    }

    @Override
    public void cry() {
        System.out.println("야옹야옹");



    }

}


// 자바에서 인터페이스 다중 구현은 가능하다.
// 어차피 구현은 부모의 메서드 구현은 내용을 따지지 않기 때문에, 누구로부터 구현받았는지에 대한 혼선이 없다.
class CatImplements2 implements AnimalInterface1,AnimalInterface2 {

    @Override
    public void play() {

    }

    @Override
    public void shape() {

    }

    @Override
    public void cry() {

    }

    @Override
    public void wheight() {

    }

}
