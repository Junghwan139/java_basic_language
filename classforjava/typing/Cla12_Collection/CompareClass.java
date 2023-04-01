package classforjava.typing.Cla12_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareClass {

    public static void main(String[] args) {

        String a = "abc";
        String b = "abg";

        // 문자의 크기를 비교하는 메서드
        // 문자는 아스키코드 비교를 통해 차이만큼의 숫자 값이 return
        System.out.println(a.compareTo(b));

        Integer a1 = 10;
        Integer a2 = 9;

        // 숫자는 크다, 같다, 작다만을 1, 0, -1을 통해 return
        System.out.println(a1.compareTo(a2));

        // 자바에서 compareTo메서드가 있는 클래스들은 모두 Comparable인터페이스를 구현

        // compareTo는 Comparable 인터페이스를 구현한 메서드이다.
        // compareTo는 많은 클래스에서 이미 구현이 되어 있고, 매개변수가 1개 밖에 없다는게 특징이다.

        // compare는 Comparator인터페이스를 구현해야 한다.
        // collections 객체에 미리 구현되어 있기도 하지만, 일반적으로 개발자가 직접 구현하여 사용한다.
        // 그리고 comparator는 comparable하고 다르게, compare메서드만을 가지고 있지는 않다. 여러 메서드 존재


        List<String> st_list = new ArrayList<>();
        st_list.add("abc");
        st_list.add("ddd");
        st_list.add("cde");
        System.out.println(st_list);

        // 오름차순 정렬
        st_list.sort(Comparator.naturalOrder());
        System.out.println(st_list);

        //Collections.sort(st_list);

        // 내림차순 정렬
        st_list.sort(Comparator.reverseOrder());
        System.out.println(st_list);

        Collections.sort(st_list,Collections.reverseOrder());  // Collections.reverseOrder() 반환객체가 comparator이다.


        List<StudentComaprator> lst = new ArrayList<>();

        StudentComaprator st1 = new StudentComaprator();
        st1.setName("kim");
        st1.setAge(15);
        st1.setClassNumber(1);
        lst.add(st1);

        StudentComaprator st2 = new StudentComaprator();
        st2.setName("choi");
        st2.setAge(16);
        st2.setClassNumber(2);
        lst.add(st2);

        StudentComaprator st3 = new StudentComaprator();
        st3.setName("lee");
        st3.setAge(14);
        st3.setClassNumber(3);
        lst.add(st3);

/*

        for(StudentComaprator s : lst){
            System.out.println("이름은 : " +s.getName()+" 나이는 : "+s.getAge()+" 반은 : "+s.getClassNumber());
        }
        System.out.println("------------------------------------------------------------------------------------");

        lst.sort(Comparator.comparing(StudentComaprator::getClassNumber));

        for(StudentComaprator s : lst){
            System.out.println("이름은 : " +s.getName()+" 나이는 : "+s.getAge()+" 반은 : "+s.getClassNumber());
        }
        System.out.println("------------------------------------------------------------------------------------");

*/

        // Collections의 sort기능을 활용하되, Comparator자리에 직접 커스터마이징한 comparator객체를 삽입할 것이다.
        // 객체를 list에 담고 정렬시킬때 가장 일반적인 형태이다. (화살표 함수 형식)
        Collections.sort(lst, new Comparator<StudentComaprator>() {
            @Override
            public int compare(StudentComaprator o1, StudentComaprator o2) {
                // 기본설정이 오름차순, 내림차순을 하고 싶다면 o1과 o2의 자리만 바꾸면 끝
                return o2.getAge()-o1.getAge();   // 로직 넣으면됨
            }
        });




        Collections.sort(lst, (o1,o2) -> o1.getAge()-o2.getAge());


        for(StudentComaprator s : lst){
            System.out.println("이름은 : " +s.getName()+" 나이는 : "+s.getAge()+" 반은 : "+s.getClassNumber());
        }
















    }

}
