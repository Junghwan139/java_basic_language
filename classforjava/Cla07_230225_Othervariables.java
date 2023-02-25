package classforjava;

import java.util.Arrays;
import java.util.Scanner;

public class Cla07_230225_Othervariables {

    public static void main(String[] args) {

/*

        int[] arr1 = {10, 20, 30};
        String[] arr2 = {"kim","lee","choi"};

//        기타자료형
//        java에서 배열의 문제는 배열의 길이를 줄이고 늘릴수가 없다.
//        List : 배열의 발전된 형태, 배열의 길이를 줄이고 늘릴 수 있다.
        List<String> lst = new ArrayList<>();
        lst.add("kim");
        lst.add("lee");
        lst.add("park");
        System.out.println(lst);
        lst.remove("park");
        System.out.println(lst);

//        map : key, value
//        set, queue(선입선출), stack(후입선출), Deque(선입, 후입 둘다 가능)
//        현실세계의 상황을 자료형과 매치 시켜 문제 풀어야 함

//        1. String
//        1) 표현 방식
//        (1) 리터럴 표현방식(원시자료형의 표현방식) - stack저장
        char c1 = 'a';
        String st1 = "hello";
        System.out.println(st1);
        System.out.println(c1);
        char c2 ='a';
        System.out.println(c2);
        System.out.println(c1==c2);
//        (2) new String 표현방식 : 참조타입 - heap 메모리 저장
//        new 라는 키워드는 class를 기반으로 객체를 만들때 사용
        String st2 = new String("hello");
        System.out.println(st2);
//        원시타입은 메모리에 값을 담아 놓지만, 참조타입은 메모리에 메모리주소를 담아둔다.
        System.out.println(st1.equals(st2));
        String st3 = new String("hello");
        System.out.println(st2.equals(st3));
//        비교시 equals 사용

//        int와 Integer(int의 참조타입 wrapper class)
        int num1 = 10;
        String st4 = "20";
        //int num2 = (int)st4;
        int num2 = Integer.parseInt(st4);
        String st5 = Integer.toString(num2);
        System.out.println(num2);
        System.out.println(st5.getClass());

//        long의 참조타입 Long, char의 참조타입 Character
//        추후 사용하게 될 자료형은 wrapper 자료형 써야 함




//        indexOf : 특정 문자가 특정문자에 몇번째 index에 해당하는지 int로 return
        String a = "Hello Java";
        int num = a.indexOf("Java");
        System.out.println(num);
        System.out.println(a.indexOf("Java"));

//        contains : 특정 문자가 특정문자에 포함되어 있는지 아닌지를 boolean으로 return
        System.out.println(a.contains("Java"));

        String st1 = "Hello Java World";
//        문자 o를 전부 a로 바꿔서 출력하는 게임을 만들어보자.

//        charAt() : String을 하나씩 잘라서 char형태로 return

        String st2 = "abcdefabcdef";
        String st3 = "abcdefabcdef";
        System.out.println(st2.charAt(3) == 'd');

//        st2이 가지고 있는 a의 숫자는 몇개인가?
//        길이 : length()

        int count = 0;
        for (int i = 0; i < st2.length(); i++) {
            if (st2.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);

//        replace : 특정 문자열을 특정문자열로 대체
//        replaceAll : 특정 문자열을 특정문자열로 대체, 정규표현식 사용가능
        String st4 = "abcabc";
        System.out.println(st4.replaceAll("a","o"));

//        String과 == 확인필요
//        정규표현식(메타문자열) : 특정한 패턴을 가진 문자열을 찾는것
//        regex regular expression
        String st5 = "01abc123한글123";
//        숫자를 제외한 문자만 새로운 문자열에 담아보자.
        String st6 = st5.replaceAll("[^a-z]","");  // 제외^, [a-z], [0-9]
        System.out.println(st6);


*/


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

*/






















    }

}
