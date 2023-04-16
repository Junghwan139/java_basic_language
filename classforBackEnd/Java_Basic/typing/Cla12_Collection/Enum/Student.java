package classforBackEnd.Java_Basic.typing.Cla12_Collection.Enum;

public class Student {

    private String name;
    private Enumclass Class_name; // 우리학년 class_name은 first, second, third 등 3가지 반만이 존재한다.
    // 변수의 타입을 enum타입으로 지정함으로써, 특정 데이터만 들어갈 수 있도록 강제하는 것

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enumclass getClass_name() {
        return Class_name;
    }

    public void setClass_name(Enumclass class_name) {
        Class_name = class_name;
    }
}
