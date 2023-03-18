package classforjava.typing.AbstractInterface;

import java.util.ArrayList;
import java.util.List;

public class Abstractmain {

    public static void main(String[] args) {


        //상속에서의 super() 및 상속 범위
        Cat ct1 = new Cat("야옹이1",20);
        System.out.println(ct1.getName());

        Animal an1 = new Animal("야옹이2",20);
        System.out.println(an1.getName());
        System.out.println(ct1.getName());

        ct1.test_print();


        ct1.play();
        ct1.shape();
        ct1.cry();

        Dog do1 = new Dog("멍멍이",30);
        do1.cry();

        //객체 타입을 CatImplements할 수도 있지만, AnimalInterface1으로 할 수도 있다.
        AnimalInterface1 caim1 = new CatImplements();
        caim1.cry();
        caim1.shape();
        caim1.play();

        //List는 인터페이스이고, ArrayList, LinkedList 등 구현체들에게 메서드 overriding 강제한다.
        List<String> lst = new ArrayList<>();


        AccessControl ac = new AccessControl();
        System.out.println(ac.name1);
        System.out.println(ac.name2);
        System.out.println(ac.name3);

        // final 키워드는 변수, 메서드, 클래스에 모두 적용 가능
        // 주로 변수 앞에 변경 불가능한 상수를 나타내는 키워드로 사용
        // 클래스 앞에 붙으면 상속불가, 메서드 앞에 붙으면 오버라이딩 불가


        final String s1 = "abc";
        // s1 = "abc2"; // 상수를 재정의 하는 것이 불가









    }

}
