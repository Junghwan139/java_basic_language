package BackEnd_Class.A_Java_Basic.typing.Cla13_ThreadGeneriStream.Generic;

public class MainClass {

    public static void main(String[] args) {

        GenericClass<String> gc = new GenericClass();
        gc.setName("홍길동");
        gc.setAge("20");

        System.out.println("이름 : "+ gc.getName()+", 나이는 : "+gc.getAge());


        // StringBuffer : Thread safe(syncronized, join)
        // StringBuilder : 성능이 더 좋다. Thread Safe하지 않다.






    }


}
