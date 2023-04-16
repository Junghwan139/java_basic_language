package classforBackEnd.Java_Basic.typing.Cla12_Collection;

public class ObjectClass {

    public static void main(String[] args) {


        String a = "abc";
        int num = 10;
        // 자바의 모든 클래스의 조상클래스는 object
        // 심지어, 별도로 만든 개별클래스의 부모도 extends object가 생략되어 있는 것.

        Player p = new Player();
        p.toString();  // tostring()은 모든 클래스에서 사용 할 수 있다.

        // equals() 등 총 11개의 메서드가 object클래스내에 내장되어 있다.

        //toString, equals는 모든 클래스가 가지고 있음



    }




}
