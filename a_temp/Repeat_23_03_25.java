package a_temp;

import java.util.*;

public class Repeat_23_03_25 {

    public static void main(String[] args) {

//        < 1W >
//        - 삼항연산자
//        int a = 10;
//        int b = 20;
//        System.out.println(a>b? a:b);

//        < 2W >
//        - 스캐너 사용
//        Scanner st = new Scanner(System.in);
//        System.out.print("숫자를 입력하세요 : ");
//        int c = st.nextInt();
//        System.out.println("입력한 숫자는 : "+c+" 입니다.");

//        < 3W >
//        - Stream을 사용한 배열 총합, 평균, 최대값, 최소값
//        int[] arr = {10,20,30,40,50};
//        int total = Arrays.stream(arr).sum();
//        double average = Arrays.stream(arr).average().getAsDouble();
//        int max = Arrays.stream(arr).max().getAsInt();
//        int min = Arrays.stream(arr).min().getAsInt();
//
//        System.out.println("총합계 : "+total+", 평균 : "+average+", 최대값 : "+max+", 최소값 : "+min);

//        < 4W >
//        - Iterator 공부필요

        Map<String, Integer> mp1 = new HashMap<>();
        mp1.put("a",1);
        mp1.put("b",2);
        mp1.put("c",3);
        mp1.put("d",4);
        mp1.put("e",5);
        mp1.put("f",6);

        System.out.println(mp1);

        for (Map.Entry<String, Integer> a: mp1.entrySet()) {
            System.out.println("key: " + a.getKey() + " value: " + a.getValue());
        }

        Iterator<Map.Entry<String, Integer>> entries = mp1.entrySet().iterator();
        Map.Entry entry = (Map.Entry) entries.next();
        System.out.println(entry);























    }

}
