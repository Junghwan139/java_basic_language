package classforBackEnd.A_Java_Basic.typing.Cla11_AbstractInterface.testpackage;

import classforBackEnd.A_Java_Basic.typing.Cla11_AbstractInterface.AccessControl;

public class AccessContrlMain extends AccessControl {

    public static void main(String[] args) {

        AccessControl ac = new AccessControl();
        System.out.println(ac.name1);
/*
        System.out.println(ac.name2);
        System.out.println(ac.name3);
*/
        // protected 변수의 경우 상속을 받을 경우 다른 패키지라 할지라도 접근 가능

        AccessContrlMain ac2 = new AccessContrlMain();
        System.out.println(ac2.name1);
        System.out.println(ac2.name2);
/*
        System.out.println(ac2.name3);
*/
        // 클래스 public, default만 가능(private, protected불가)




    }

}
