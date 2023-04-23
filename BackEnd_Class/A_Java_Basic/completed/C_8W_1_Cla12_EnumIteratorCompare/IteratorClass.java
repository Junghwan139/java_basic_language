package BackEnd_Class.A_Java_Basic.completed.C_8W_1_Cla12_EnumIteratorCompare;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorClass {

    public static void main(String[] args) {

//        1. iterator란 java 컬렉션프레임워크에서 사용되는 반복데이터를 처리하기 위한 인터페이스다.
//        1) 주요 메서드 : hasNext(), next()

        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(1,10);
        mp.put(2,20);

        Iterator<Integer> it = mp.keySet().iterator();
        // mp.keySet().iterator();이걸 먼저 만들고 이걸 받을 iterator를 선언한다.
        // 대부분의 컬렉션프레임워크 자료형에 iterator()라는 메서드가 내장되어 있고,
        // 해당 메서드의 return값은 iterator객체이다.

        while (it.hasNext()){
            System.out.println(it.next());
        }








    }



}
