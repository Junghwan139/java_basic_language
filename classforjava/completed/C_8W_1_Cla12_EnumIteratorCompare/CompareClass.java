package classforjava.completed.C_8W_1_Cla12_EnumIteratorCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareClass {


    public static void main(String[] args) {

//        2가지 인터페이스 : 1. Comparable(인터페이스) -> (메소드) compareTo()
//                        => String, Integer에서 comparable을 구현하고 있으나 서로 다르게 구현해서 return값이 다르다
//                       2. Comparator(인터페이스) -> (메소드) compare

//         1. compareTo : 문자의 크기를 비교하는 메서드(문자는 아스키코드 비교를 통해 차이 값 숫자 return
        String a = "abc";
        String b = "ddd";
        System.out.println(a.compareTo(b));
        Integer k = 10;
        Integer j = 4;
        System.out.println(k.compareTo(j));

//        2. compare
        List<String> lst = new ArrayList<>();
        lst.add("abc");
        lst.add("ddd");
        lst.add("cde");
        System.out.println(lst);

        Collections.sort(lst);
        System.out.println(lst);

        Collections.sort(lst, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(lst);

        Collections.sort(lst,(o1, o2) -> o1.compareTo(o2));
        System.out.println(lst);




    }


}
