package classforBackEnd.A_Java_Basic.completed.C_8W_2_Cla13_ThreadGenericStream.Generic;

public class GenericClass<T> {

    private T age;
    private String name;
    private String friendsname;


    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFriendsname() {
        return friendsname;
    }

    public void setFriendsname(String friendsname) {
        this.friendsname = friendsname;
    }
}
