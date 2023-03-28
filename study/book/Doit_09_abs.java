package study.book;

public class Doit_09_abs {

    public static void main(String[] args) {

//        1. 추상 클래스(abstract class) ↔ cocrete class
//        1) 추상 클래스란?
//           - 추상클래스는 항상 추상 메서드를 포함한다. 추상 메서드는 구현 코드가 없다(body가 없다) 추상 메서드는 선언만하고,
//             abstract예약어 사용 ex) abstract int add(int x, int y);
//           - 구현부가 없다는 것은 설계만 해놓은 것이고, 상속받은 곳에서 어떻게 구현하는가에 따라 달라질 수 있음을 의미
//           - 구현에 대한 책임을 상속받는 클래스에 위임한다.
//        2) 추상 클래스 구현하기
//           - 상속받는 하위 클래스에서는 추상메서드를 모두 구현하든가 아니면 하위 클래스를 추상클래스로 만들든가 둘 중 하나를 해야함
//           - 모두 구현된 메소드를 가지고 있는 클래스라 할 지라도 abstract예약어를 사용하면 추상 클래스이다.
            /* ex) AbstractTV 클래스는 모든 추상 메서드를 구현한 클래스이나, 이것으로 완벽한 TV기능이 구현된 것이 아님
                   즉 해당 클래스가 모든 기능을 구현해 놓지 않은 상황이라면, 해당 클래스를 추상클래스로 만들어 놓고 상속을
                   목적으로 사용할 수 있다. 이 경우 new 예약어로 인스턴스 생성 불가
            */
//        3) 추상 클래스를 만드는 이유

//        2. 템플릿 메서드






    }

}