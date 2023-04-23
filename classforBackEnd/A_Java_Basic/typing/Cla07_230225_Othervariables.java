package classforBackEnd.A_Java_Basic.typing;

import java.util.*;

public class Cla07_230225_Othervariables {

    public static void main(String[] args) {

//        << 23.02.25 >>

/*


//        1. String

//        (1) substring(a,b) : a이상 b미만까지 문자열을 잘라낸다.

        String st = "hello world";
        System.out.println(st.substring(6,11));
        System.out.println(st.substring(6,st.length()));

//        (2) toUpperCase : 대문자로 변환 / toLowerCase : 소문자로 변환

        System.out.println(st.toUpperCase());




//        (3) split : 특정문자열을 가지고 규칙적으로 문자열을 자를때 사용(정규표현식 사용가능). return값이 String[]
        String st= "abcd";
        String[] st_arr = st.split("[0-9]");  //배열 isEmpty() 공백체크
        System.out.println(Arrays.toString(st_arr));
        String[] str2_arr = st.split("");
        System.out.println(Arrays.toString(str2_arr));

        String st3 = "qedsnajwkffnsafsflfds";

//        split을 써서 몇번째인지 구해보자.

        String[] st3_arr = st3.split("");
        System.out.println(Arrays.toString(st3_arr));

        for(int i = 0;i<st3_arr.length;i++){
            if(st3_arr[i].equals("w")){
                System.out.println(i);
                break;
            }
        }


//        (4) 합치기 : +, StringBuffer, StringBuilder
//      (+) *메모리상에 과부하가 생길 수 있는 방식, 매번 값을 재정의하기 때문에
        String st = "abcd";
        String[] st_arr = st.split("");
        System.out.println(Arrays.toString(st_arr));
        String result = " ";
        for (String a : st_arr) {
            result += a; // result = "" result ="a" result ="ab" result="abc" result = "abcd"
        }
        System.out.println(result);

//        StringBuffer, StringBuilder
//        두방법은 대부분 유사하나, StringBuilder가 성능이 더 좋음
//        그러나, StringBuilder는 특정상황에서 문제가 발생할 여지가 있다.

        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" world");
        System.out.println(sb);

        System.out.println("sb = " + sb);


//        문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
//        각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
//        각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.



//               s	return
//"try hello world"	"TrY HeLlO WoRlD"



        String s = "try hello world";
        String answer = " ";
        String[] s_arr = s.split("");
        System.out.println(Arrays.toString(s_arr));

        int bl = 0;  //단어 체크

        for (int i = 0; i < s_arr.length; i++) {

            if (bl % 2 == 0) {
                s_arr[i] = s_arr[i].toUpperCase();
            } else {
                s_arr[i] = s_arr[i].toLowerCase();
            }
            bl++;
            
            if (s_arr[i].isBlank()) {
                bl = 0;

            }
        }

        System.out.println(Arrays.toString(s_arr));

        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < s_arr.length; i++) {
            sb1.append(s_arr[i]);
        }
        System.out.println(sb1);
        answer = sb1.toString();



//        Trim : 문자열 양 끝에 공백을 제거
        String st1 = " hello world ";
        System.out.println(st1);
        System.out.println(st1.trim());
        String db_input = "abc@naver.com";
        System.out.println("로그인 id를 입력해 주세요");
        Scanner sc = new Scanner(System.in);
        String input = (sc.nextLine()).trim();
        System.out.println(input);
        System.out.println(input.equals(db_input));


//        Strip : 문자열 양 끝에 공백을 제거, 그러나 더 좋은 성능, 공백도 아스키코드가 있음. 공백의 종류가 다양
//        희안한 공백의 경우 trim으로 처리 불가 utf-8 대응 안됨

        String a = " abc ";
        System.out.println(a.trim());
        System.out.println(a.strip());





//        << 23.02.26 >>

//        2. 자료형 변환
//        (1) String에서 int로 변환
//        Integer.parseInt
        String st = "10";
        int num = Integer.parseInt(st);
        System.out.println(num);

//        (2) int에서 String으로 변환
//        Integer.toString
//        대부분은 타입은(대부분 객체) 모두 toString을 가지고 있다.

        int a =10;
        String st1 = Integer.toString(a);
        String st2 = String.valueOf(a);
        System.out.println(st1);
        System.out.println(st2);

//        (3) char int간의 변환
        char ch = 'a';
        int num1 = ch;
        num1 = Character.valueOf(ch);
        System.out.println(num1);

//        (추가) StringBuffer
//        - insert(원하는 자리, 문구)
//        - String에서 사용하는 메소드 사용 가능. ex) substring( , )




//        3. Array(배열)
//        (1) 선언
//        선언과 동시에 초기화
        int[] arr1 = {10,20,30,40,50};
//        선언만 : java의 배열은 반드시 길이를 명시
//        primitive 타입은 해당 타입으로 초기화(ex int는 0), 참조형변수는 null로 초기화
        int[] arr2 = new int[5];

        String[] st_arr = {"abc", "bcd"};
        String[] st_arr2 = new String[10];
        System.out.println(st_arr2[5]);



//        (2) 메소드(Arrays 클래스)
//         - 정렬 : Arrays.sort (원본값을 수정)
//        프로그래밍에서 별다른 설정이 없으면, 정렬의 기본은 오름차순
        int[] arr = {30,20,10,50};

//        내림차순 같은 경우엔 Integer를 쓰거나, Comparator를 이용해야 한다. 그래서 추후에 해당 내용 학습
//        Arrays.sort의 내림차순은 Collections.reverseOrder를 써야 한다. (String은 문제 없음 int는 primitive타입이라 문제발생)
//        int의 내림차순 정렬 : Integer로 변환 → Collections.reverseOrder

        Integer[] arr_integer = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr_integer, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr_integer));


//        - 검색 : binarySearch(이진검색) - 자료형이 정렬되어 있어야 정상적으로 자료를 검색하여 index를 return
//                                        개념이 중요, index를 절반씩 잘라 나가며 찾으려는 값과의 크기를 비교
        int[] arr = {30,20,10,50};
//        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,30));


//        - 배열의 복사 : copyOf(복사하고자하는 배열, length), copyOfRange(복사하고자하는 배열 a, b)
        String[] arr_st = {"a1","a2","a3"};
        String[] arr_st_new = Arrays.copyOf(arr_st,5);
        System.out.println(Arrays.toString(arr_st_new));


//        4. List : 자료길이 유연함
//        (1) 선언 : 선언방법은 new List를 통해 List를 생성한다.
        List<String> l1 = new ArrayList<>();  //ArrayList는 List의 종류
        l1.add("abc");
        l1.add("bcd");
        System.out.println(l1);

        List<String> l2 = new ArrayList<>(Arrays.asList("abc","bcd"));  //선언과 초기화 동시
//        배열을 리스트로 넣는 방법 Arrays.asList(배열), for문
        String[] arr1 ={"a1","b1","c1","d1"};
        List<String> l3 = new ArrayList<>(Arrays.asList(arr1));
        for(String a : arr1){
            l3.add(a);
        }
        System.out.println(l3);

//        (2) 변환 : List에서 배열로 변환
//        list에서 값을 꺼내는 메서드는 l3.get(index)
//        list의 크기를 l3.size()
        String[] answer = new String[l3.size()];
        int i = 0;
        for(String a : l3){
            answer[i]=a;
            i++;
        }
        System.out.println(Arrays.toString(answer));

//        stream 사용
        String[] answer2 = l3.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(answer2));

        int[] arr3 = {10,20,30};
        List<Integer> num3 = new ArrayList<>();
        for(i = 0;i<arr3.length;i++){
            num3.add(arr3[i]);
        }
        System.out.println(num3);

//        list의 remove는 index로 지울수도 있고, value로 지울수도 있다.

//        (3) 메소드 : .contains(값), .isEmpty(),

//        (4) 정렬 : sort, Comparator.naturaorder(오름차순),Comparator.reverseOrder(내림차순)
        List<String> lst1 = new ArrayList<>();
        lst1.add("b");
        lst1.add("a");
        lst1.add("c");
        System.out.println(lst1);
        lst1.sort(Comparator.naturalOrder());
        System.out.println(lst1);
        lst1.sort(Comparator.reverseOrder());
        System.out.println(lst1);

        String[] arr4 = {"b","a","c"};
        Arrays.sort(arr4);
        Arrays.sort(arr4,Comparator.reverseOrder());


//        (컬렉션 프레임워크)


//        5. map : key와 Value로 이루어져 있는 자료형
//        (1) 선언 key, value 타입을 반드시 선언
        Map<String, String> mp = new HashMap<>();  // HashMap은 map의 종류
//        map에 값을 더할 때 : key는 중복되지 않는다.(유일한 값이어야 함)
        mp.put("a1","abc");
        mp.put("a2","abc");
        mp.put("a3","abc");

//        System.out.println(mp);

//        map에서 값을 꺼낼때는 key를 통해 값을 꺼낸다. value가 중복이 가능하므로 value를 통해 값을 꺼낼 수는 없다.
//        map의 key에는 순서(index)가 없다.

//        System.out.println(mp.get("a1"));

//        map은 자료 검색시 key를 통해 굉장히 빠르게 검색이 가능(list로 작업속도 문제 발생시 map으로 해결하는 방법 고려필요)
//        List<String> lst = new ArrayList<>();

//        key목록
//        System.out.println(mp.keySet());

//        value목록
//        System.out.println(mp.values());

//        각 key에 문자f를 붙여 출력해보라.

        String[] st = new String[mp.size()];
        int i = 0;
        for(String a : mp.keySet()){
            st[i]=a+"f";
            i++;
        }

        System.out.println(Arrays.toString(st));


//        containskey : 해당 key가 있는지 없는지
        System.out.println(mp.containsKey("a1"));

*/
//        << 완주하지 못한 선수 >>
        String[] participant = {"leo", "kiki", "eden", "aaaa"};
        String[] completion = {"eden", "kiki", "aaaa"};
        String answer = "";
        Map<String, Integer> mp = new HashMap<>();
        for (String a : participant) {
            if (mp.containsKey(a)) {
                mp.put(a, mp.get(a) + 1);
            } else {
                mp.put(a, 1);
            }

        }

        for (String a : completion) {
            if (mp.get(a) > 1) {
                mp.put(a, mp.get(a) - 1);
            } else {
                mp.remove(a);
            }
        }

       for(String a : mp.keySet()){
           answer = a;
       }




    }

}

class Cla07 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}