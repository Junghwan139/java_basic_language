package classforjava;

import java.util.*;

public class C_4W_Cla06to7_230219_Othervariables_S {
    public static void main(String[] args) {


//        자료형 : 원시자료 형(int, long, double, char 등) -> 값을 그대로 저장(주소도 있지만 값을 우선)
//        class형 : String, list, set -> 주소로 저장(값도 있지만 주소를 우선) * String의 경우 원시자료 형도 가능
//        자료형은 값비교 시 ==으로 비교, class형은 주소로 저장 되어 값비교 시 equals() 사용

//        저장 방식이 다름



//        1. String
//         1) String 함수
//           - 찾을 때 : indexOf  <<인덱스 int 리턴>>
        String st1 = "Studying java";
        System.out.println(st1.indexOf("j"));
//           - 확인 : contains() <<포함여부 boolean 리턴>>
//           - 꺼낼 때 : charAt() <<문자 값 char 리턴>>
//           - 바꿀 떄 : replaceAll() <<변환된 문자열 String 리턴>>
        System.out.println(st1.length());
        String [] st2 = new String [st1.length()];
        st2=st1.split("");
        System.out.println(Arrays.toString(st2));
        String st3 = String.join("",st2);
        System.out.println(st3);
        int count = 0;
        for(int i =0;i<st1.length();i++){
            if(st1.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);

//           - 자를 떄 : substring(a, b) <<변환된 문자열 String 리턴>>
        String st4 = st1.substring(1,4);
        System.out.println(st4);

//           - 바꿀 때 : toUpperCase(), toLowercase() <<변환된 문자열 String 리턴>>
        String st5 = st1.toUpperCase();
        System.out.println(st5);

//           - 자를 때 : split(" ") <<변환된 문자열 String 리턴>>
//           - 합칠 떄 : +, StringBuffer(사용), StringBuilder, join(사용) <<변환된 문자열 String 리턴>>
//             (StringBuffer은 새로운 자료형과 같음. String 메소드, insert사용 가능)
        StringBuffer stb = new StringBuffer();
        stb.append("aaa");
        stb.append(111);
        System.out.println("stb = "+stb);

        String [] st_arr = {"aa","bb","cc"};
        String st6 = String.join(" ",st_arr);
        System.out.println(st6);

//           - 정리 : Trim, Strip(사용)
//           * 공백체크 : isEmpty(), isBlank()


//        << 자료형 변환 >>
//         1) String → int : Integer.parseInt(String 변수)
//         2) int    → String : Integer.toString(int 변수), String.valueOf(int 변수)

//        2. Array(배열)
//         1) 선언
//         2) 메소드
//            - 정렬 : Arrays.sort(배열 변수) → 원본값 수정, 기본은 오름차순 정렬, 내림차순은 Integer 또는 Comparator를 이용

        int[] arr = {40,30,10, 50,20};
        Integer[] arr_integer = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr_integer, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr_integer));

//            - 데이터 검색 : Arrays.binarySearch(배열 변수, 값) → 이진검색

//        3. List
//         1) 선언 : List<String> lst = new Arraylist<>();  //Arraylist는 list의 종류
//         2) 메소드 : 값 꺼내기 .get(index), 크기 .size(), 추가 .add, 제거 remove(값), 포함여부 contains(값), isEmpty()
//         3) 변환 List → 배열 : for문 사용, stream 사용
//          - stream 사용
        List<String > l3 = new ArrayList<>();
        l3.add("hello4");
        l3.add("hello3");
        l3.add("hello2");
        l3.add("hello1");
        l3.remove("hello4");
        String[] answer2 = l3.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(answer2));

//            변환 배열 → List Arrays.asList
//        List<String> l3 = new ArrayList<>(Arrays.asList(arr1));

//        4) 정렬 : sort, Comparator.naturaorder(오름차순),Comparator.reverseOrder(내림차순)

        System.out.println(l3);

//        4. Map : key와 value로 이루어져 있는 자료형
//         1) 선언 : key, value타입을 반드시 선언
        Map<String,Integer> mp = new HashMap<>();
        System.out.println(mp);
//         2) 특징 : key는 중복 불가(중복추가 시 values 덮어쓰기). values는 중복가능.(따라서 valuse로 꺼낼 수 없음)
//                  map은 자료 검색이 빠르다는 장점이 있음
//         3) 메소드 : 값꺼내기 .get(key), 크기 .size(), 추가 .put(key, 값), 제거 .remove(key), 포함여부 containsKey(key)
//                    ★ getOrDefault 공부할 것
        mp.put("a",+1);
        mp.put("a",mp.get("a")+1);
        mp.put("a",mp.get("a")+1);
        mp.put("a",mp.get("a")+1);
        System.out.println(mp);






























    }
}
