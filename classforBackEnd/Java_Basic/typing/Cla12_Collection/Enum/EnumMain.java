package classforBackEnd.Java_Basic.typing.Cla12_Collection.Enum;

public class EnumMain {

    public static void main(String[] args) {

/*
        Student s1 = new Student();
        s1.setName("홍길동");
        s1.setClass_name("first");  // 개발자가 정해 놓은 이름이 있는데도 잘 못 입력해도 입력 및 실행 가능(에러발생x) ->강제해야함
        System.out.println("학생 정보는 이름은 "+s1.getName()+"반은 "+s1.getClass_name());

*/
        Student s2 = new Student();
        s2.setName("홍길순");
        s2.setClass_name(Enumclass.FIRST);
        System.out.println("학생 정보는 이름은 "+s2.getName()+" 반은 "+s2.getClass_name());






    }

}
