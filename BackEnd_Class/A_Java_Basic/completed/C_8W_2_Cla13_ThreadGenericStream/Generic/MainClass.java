package BackEnd_Class.A_Java_Basic.completed.C_8W_2_Cla13_ThreadGenericStream.Generic;

public class MainClass {

    public static void main(String[] args) {


        GenericClass<String> gc = new GenericClass();
        gc.setName("홍길동");
        gc.setAge("15");
        gc.setFriendsname("홍길순");

        System.out.println(gc.getName()+gc.getAge()+gc.getFriendsname());



    }


}
