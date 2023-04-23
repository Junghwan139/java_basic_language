package classforBackEnd.A_Java_Basic.typing.Cla12_AnonymusLambda;

public class AnonymusMain {

    public static void main(String[] args) {

/*
        // 일반 객체
        Anonymus a1 = new Anonymus();
        System.out.println(a1.getNum());
        System.out.println(a1.getClass()); // class의 이름을 출력하는 함수

        // 익명 객체 : 상속을 받긴 받으나, 상속의 형태가 아니다. (임시로 재정의)
        // 즉, 본래의 이름을 잃어버린, 익명클래스(객체)가 된다.

        Anonymus a2 = new Anonymus(){
            private int num = 2;
            @Override
            public int getNum(){
                return this.num;
            }
        };

        System.out.println(a2.getNum());
        // 참조변수의 타입이 class로 출력되지 않고, 실행하고 있는 클래스의 이름이 출력된다.
        System.out.println(a2.getClass());

*/


        // 익명클래스를 사용하는 일반적인 경우는 : 인터페이스 구현 시
        // 인터페이스 → 사용하려면 override필수
        // override해서 별도의 클래스를 만들기 싫을때
        // 그때, 별도의 클래스 없이 익명크래스를 즉시 만들어 사용

        // 인터페이스로는 객체를 못 만들어서,,,

/*
        AnimalInterface ai = new AnimalInterface() {
            @Override
            public void cry() {
                System.out.println("야옹야옹");
            }
        };

        ai.cry();

*/
        // 익명객체 방식에서 익명함수 방식으로의 전환 즉, 메서드에 이름이 없다는 뜻.
        // (x) 매개변수의 타입/갯수 만으로도 메소드를 구분지을 수 있을때 익명함수를 쓸 수 있다.
        // 익명객체서 익명함수로 전환 ->함수 사용 앞에꺼를 뒤에꺼로 실행해

        AnimalInterface ai2 = (String a) -> System.out.println(a+"야옹야옹2");   // 화살표 함수 ->
        ai2.cry("abc");

        AnimalInterface a3 = new AnimalInterface() {
            @Override
            public void cry(String a) {
                System.out.println("cry cry"+a);
            }
        };


        AnimalInterface a4 = new AnimalInterface() {
            @Override
            public void cry(String a) {
                System.out.println("cry cry"+a);
            }
        };

        // 인터페이스 이니까 구현을 하겠구나 예측
        // 매개변수는 들어와야 함 그리고 ->와 같이 변할꺼다
        // AnimalInterface a4 = (String a) -> System.out.println("cry cry"+a);
























    }

}
