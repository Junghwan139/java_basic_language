package codingtest;

import java.util.*;

public class Ct042_repeatwordremove {
    public static void main(String[] args) {


//        << 중복된 문자 제거 >>

//        문자열 my_string이 매개변수로 주어집니다.
//        my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

/*
        입출력 예
        my_string	result
        "people"	"peol"
        "We are the world"	"We arthwold"

*/


        String my_string = "We are the world";
        String answer = "";

        Map<String, Integer> mp = new HashMap<>();
        List<String> lst = new ArrayList<>(Arrays.asList(my_string.split("")));
        System.out.println(lst);

        int i = 0;
        for (String a : my_string.split("")) {
            if (mp.containsKey(a)) {
                mp.put(a, mp.get(a) + 1);
            } else {
                mp.put(a, 1);
            }
        }
        System.out.println(mp);


        for (i = lst.size() - 1; i > 0; i--) {
            System.out.printf("%s, %d", lst.get(i), mp.get(lst.get(i)));
            if (mp.get(lst.get(i)) > 1) {
                mp.put(lst.get(i), mp.get(lst.get(i)) - 1);
                lst.remove(i);
                System.out.printf("→ %d \n", mp.get(lst.get(i)));

//                System.out.println(mp);
            } else {
                System.out.printf("→ %d \n", mp.get(lst.get(i)));
            }
        }
//
        System.out.println(lst);
        answer = String.join("", lst);
        System.out.println(answer);


    }

}
